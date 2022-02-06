package com.ssafy.websns.controller;

import com.ssafy.websns.model.dto.feed.FeedDto.CreateReq;
import com.ssafy.websns.model.dto.feed.FeedDto.CreateRes;
import com.ssafy.websns.service.FeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FeedRestController {

  private final FeedService feedService;

  @PostMapping("/feed")
  public ResponseEntity<CreateRes> createFeed(@RequestBody CreateReq request){

    CreateRes response = feedService.postFeed(request);
    return new ResponseEntity<>(response, HttpStatus.OK);

  }

}
