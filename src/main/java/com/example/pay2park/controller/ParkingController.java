package com.example.pay2park.controller;


import com.example.pay2park.model.ParkingListData;
import com.example.pay2park.model.ResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class ParkingController {
//    @GetMapping("/getAllParking")
//    @ResponseBody
//    public ResponseEntity<ResponseObject> getAllParking() throws IOException {
//
//        List<ParkingListData> data = new ArrayList<ParkingListData>();
//        ParkingListData p1 = new ParkingListData(1L, "An Khánh", 10.783888816833496,106.7347183227539,5,22,0 );
//        ParkingListData p2 = new ParkingListData(2L, "Hiệp Phú", 10.846667289733887, 106.77777862548828, 5,22,0 );
//        ParkingListData p3 = new ParkingListData(3L, "Linh Chiểu",  10.856389045715332, 106.76249694824219, 5,22,0  );
//        ParkingListData p4 = new ParkingListData(4L, "An Khánh", 10.783888816833496,106.7347183227539,5,22,1 );
//        ParkingListData p5 = new ParkingListData(5L, "Hiệp Phú", 10.846667289733887, 106.77777862548828, 5,22,1 );
//        ParkingListData p6 = new ParkingListData(6L, "Linh Chiểu",  10.856389045715332, 106.76249694824219, 5,22,0  );
//        data.add(p1);
//        data.add(p2);
//        data.add(p3);
//        data.add(p4);
//        data.add(p5);
//        data.add(p6);
//        return  ResponseEntity.status(HttpStatus.OK).body(
//                new ResponseObject("OK", "OK", data)) ;
//    }

    @GetMapping("/")
    String hello(){
        return "hello";
    }


}
