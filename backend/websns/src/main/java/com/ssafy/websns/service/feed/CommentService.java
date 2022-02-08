package com.ssafy.websns.service.feed;

import com.ssafy.websns.model.dto.feed.CommentDto.CreateReq;
import com.ssafy.websns.model.dto.feed.CommentDto.CommentRes;
import com.ssafy.websns.model.dto.feed.CommentDto.UpdateReq;
import com.ssafy.websns.model.dto.feed.CommentDto.UpdateRes;
import com.ssafy.websns.model.entity.feed.Comment;
import com.ssafy.websns.model.entity.feed.Feed;
import com.ssafy.websns.model.entity.user.User;
import com.ssafy.websns.repository.feed.CommentRepository;
import com.ssafy.websns.repository.feed.FeedRepository;
import com.ssafy.websns.repository.user.UserRepository;
import com.ssafy.websns.service.validation.ValidateExist;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CommentService {

  private final CommentRepository commentRepository;
  private final FeedRepository feedRepository;
  private final UserRepository userRepository;

  @Transactional
  public CommentRes postComment(Integer feedNo, CreateReq request) {

    ValidateExist validateExist = new ValidateExist(commentRepository, feedRepository, null);

    User user = userRepository.findByNo(request.getUserNo());
    Feed feed = validateExist.findFeedByNo(feedNo);

    Integer parentNo = request.getParent();
    Comment parentComment = new Comment();

    if (parentNo != -1) {
      parentComment = validateExist.findCommentsByNo(parentNo);
    }

    Comment comment = new Comment();
    comment.createComment(request.getNo(), user, feed, parentComment,
        request.getContent(), request.getPrivateMode(), request.getDeleteMode());

    commentRepository.save(comment);

    CommentRes response = new CommentRes(comment.getUser().getId(), comment.getFeed().getNo(), comment.getParent(),
        comment.getContent(), comment.getCreatedAt());

    return response;

  }

  @Transactional
  public UpdateRes editComment(Integer commentNo, UpdateReq request) {

    ValidateExist validateExist = new ValidateExist(commentRepository, feedRepository, null);

    Comment comment = validateExist.findCommentsByNo(commentNo);
    comment.updateComment(request.getContent(), request.getPrivateMode());

    UpdateRes response = new UpdateRes(comment.getContent(), comment.getPrivateMode(),
        comment.getUpdatedAt());

    return response;

  }

  public void cancelComment(Integer commentNo) {

    ValidateExist validateExist = new ValidateExist(commentRepository, feedRepository, null);

    Comment comment = validateExist.findCommentsByNo(commentNo);
    comment.deleteComment();

  }

  public List<CommentRes> searchComments(Integer feedNo) {
    ValidateExist validateExist = new ValidateExist(commentRepository, feedRepository, null);

    Feed feed = validateExist.findFeedByNo(feedNo);
    List<CommentRes> comments = validateExist.findCommentsByFeed(feed);

    return comments;

  }

}
