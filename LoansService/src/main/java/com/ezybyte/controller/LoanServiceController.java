package com.ezybyte.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanServiceController {

    @GetMapping("/getLoans")
    public ResponseEntity getLoanDetails(){
        return new ResponseEntity("Loans", HttpStatus.OK);
    }

}
