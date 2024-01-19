package com.icv.app.controllers;

import com.icv.app.model.LoginData;
import com.icv.app.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@Controller
@RestController
@RequestMapping("/Login")
public class loginController {

    @Autowired
    private loginService logServc;

//    //public loginController() {
//        super();
//    }

    @GetMapping("/shiva")
    public ResponseEntity<String> gfdsjgh()
    {
        System.out.println("COntroller executed");
        return  new ResponseEntity<>("fsdfsd", HttpStatus.OK);

    }


    @PostMapping("/username")
    public ResponseEntity<Void> addUserName(@RequestBody LoginData loginData)
    {
        System.out.println(loginData.getUserName() );
        System.out.println(loginData.getPassWord() );
        logServc.addUserName(loginData);
        System.out.println("COntroller executed");
        return new ResponseEntity<Void>(HttpStatus.OK);

    }


    @PostMapping("/enstatus")
    public ResponseEntity<Void> EnableUserName(@RequestBody LoginData loginData)
    {
        try {
            logServc.EnableUserName(loginData);
            return new ResponseEntity<Void>(HttpStatus.OK);

        }
        catch(Exception e)
        {
            return ResponseEntity.internalServerError(   ).build();

        }
    }

    @PostMapping("/disstatus")
    public ResponseEntity<Void> DisableUserName(@RequestBody LoginData loginData)
    {
        try {
            System.out.println("jkhsfgie");
            logServc.DisableUserName(loginData);
            return new ResponseEntity<Void>(HttpStatus.OK);

        }
        catch(Exception e)
        {
            return ResponseEntity.internalServerError(   ).build();

        }
    }





}
