package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {
        Map<String, Object> loanDetails = new HashMap<>();
        loanDetails.put("number", number);
        loanDetails.put("type", "car");
        loanDetails.put("loan", 400000);
        loanDetails.put("emi", 3258);
        loanDetails.put("tenure", 18);
        return loanDetails;
    }
}
