package com.icv.app.controllers;

import com.icv.app.model.SeatData;
import com.icv.app.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/Seat")
public class SeatController {

    @Autowired
    private SeatService seatService;


    @PostMapping("/s")
    public ResponseEntity<Void> addSeat(@RequestBody SeatData seatData)
    {
        seatService.addSeat(seatData);
        return new ResponseEntity<Void>(HttpStatus.OK);


    }


}
