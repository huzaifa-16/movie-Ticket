package com.icv.app.controllers;


import com.icv.app.model.TicketData;
import com.icv.app.service.TicketService;
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
@RequestMapping("/Ticket")
public class TicketController {


    @Autowired
    private TicketService ticketService;


    @PostMapping("/count")
    public ResponseEntity<Void> addTicket(@RequestBody TicketData ticketData) {

        try {

            ticketService.addTicket(ticketData);
            return new ResponseEntity<Void>(HttpStatus.OK);

        }
        catch (Exception e)
        {
            return ResponseEntity.internalServerError(	).build();
        }
    }
}
