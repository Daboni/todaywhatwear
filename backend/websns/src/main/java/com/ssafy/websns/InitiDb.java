//package com.ssafy.websns;
//
//import com.ssafy.websns.model.domain.region.Region;
//import com.ssafy.websns.repository.region.RegionRepository;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import javax.annotation.PostConstruct;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class InitiDb {
//
//  private final RegionRepository repository;
//
//  @PostConstruct
//  void init() throws IOException {
//    BufferedReader reader = new BufferedReader(
//        new FileReader("C:\\Users\\Jang\\Desktop\\region.txt")
//    );
//    String str;
//    while ((str = reader.readLine()) != null) {
//      String[] list = str.split(",");
//      Region region = new Region(list[0], Integer.parseInt(list[1]));
//
//      repository.save(region);
//
//    }
//    reader.close();
//  }
//}
