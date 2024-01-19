package com.icv.app.controllers;


import com.icv.app.model.DashBoardData;
import com.icv.app.service.DashBoardService;
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
@RequestMapping("/DashBoard")
public class DashBoardController {

    @Autowired
    private DashBoardService dashBoardService;

    @PostMapping("/movie")
    public ResponseEntity<Void> addMovie(@RequestBody  DashBoardData dashBoardData)
    {
        System.out.println(dashBoardData.getMovieName());
        System.out.println(dashBoardData.getCost());
        dashBoardService.addMovie(dashBoardData);
        System.out.println("COntroller executed");
        return new ResponseEntity<Void>(HttpStatus.OK);

    }


    @PostMapping("/upcost")
    public ResponseEntity<Void> updatecost(@RequestBody  DashBoardData dashBoardData)
    {
        if(dashBoardService.updatecost(dashBoardData)==200)
        {
            return new ResponseEntity<Void>(HttpStatus.OK);

        }
        else
        {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

        }


    }
}


