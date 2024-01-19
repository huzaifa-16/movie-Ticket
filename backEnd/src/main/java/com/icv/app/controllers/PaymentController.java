package com.icv.app.controllers;

import com.icv.app.model.PaymentData;
import com.icv.app.service.PaymentService;
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
@RequestMapping("/Payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/pay")
    public ResponseEntity<Void> addPayment(@RequestBody PaymentData paymentData)
    {

        System.out.println(paymentData.getPayment());
        paymentService.addPayment(paymentData);
        System.out.println("COntroller executed");
        return new ResponseEntity<Void>(HttpStatus.OK);

    }
}
