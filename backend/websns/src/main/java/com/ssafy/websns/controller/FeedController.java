package com.ssafy.websns.controller;

import com.ssafy.websns.model.dto.feed.CommentDto.CommentRes;
import com.ssafy.websns.model.dto.feed.FeedDto.CreateReq;
import com.ssafy.websns.model.dto.feed.FeedDto.FeedDetailRes;
import com.ssafy.websns.model.dto.feed.FeedDto.FeedReq;
import com.ssafy.websns.model.dto.feed.FeedDto.FeedRes;
import com.ssafy.websns.model.dto.feed.FeedDto.UpdateReq;
import com.ssafy.websns.model.dto.feed.FeedDto.UpdateRes;
import com.ssafy.websns.service.feed.CommentService;
import com.ssafy.websns.service.feed.FeedService;
import java.util.List;
<<<<<<< HEAD
=======
import lombok.Data;
>>>>>>> 0245625ad8b79b22b0626e1f9520a29739014d14
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/feed")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class FeedController {

  private final FeedService feedService;
  private final CommentService commentService;

  @PostMapping
  public ResponseEntity<FeedRes> createFeed(@RequestBody CreateReq request){

    CreateReq createReq = new CreateReq(request,images);

    FeedRes response = feedService.postFeed(createReq);
    return new ResponseEntity<>(response, HttpStatus.OK);

  }

  @PutMapping("/{feedNo}")
  public ResponseEntity<UpdateRes> updateFeed(@PathVariable("feedNo")Integer feedNo,
      @RequestBody UpdateReq request) {

    UpdateRes response = feedService.editFeed(feedNo, request);
    return new ResponseEntity<>(response, HttpStatus.OK);

  }

  @DeleteMapping("/{feedNo}")
  public void deleteFeed(@PathVariable("feedNo")Integer feedNo) {

    feedService.cancelFeed(feedNo);

  }

  @GetMapping("/{regionNo}")
  public ResponseEntity<Page<FeedRes>> showFeeds(@PathVariable("regionNo")Integer regionNo, @PageableDefault(size = 20) Pageable pageable) {

    List<FeedRes> feeds = feedService.showFeedsWithPage(regionNo, pageable);
    Page<FeedRes> pageRes = new PageImpl<>(feeds, pageable, feeds.size());

    return new ResponseEntity<>(pageRes,HttpStatus.OK);

  }

  @GetMapping("/details/{feedNo}")
  public ResponseEntity<FeedDetails> showFeed(@PathVariable("feedNo")Integer feedNo) {

    FeedRes feed = feedService.showFeed(feedNo);
    List<CommentRes> comments = commentService.searchComments(feedNo);

    FeedDetails feedDetails = new FeedDetails(feed,comments);

    return new ResponseEntity<>(feedDetails,HttpStatus.OK);

  }


  @Data
  private class FeedDetails {

    private FeedRes feedRes;
    private List<CommentRes> commentRes;

    public FeedDetails() {

    }

    public FeedDetails(FeedRes feedRes,
        List<CommentRes> commentRes) {
      this.feedRes = feedRes;
      this.commentRes = commentRes;
    }
  }
}
