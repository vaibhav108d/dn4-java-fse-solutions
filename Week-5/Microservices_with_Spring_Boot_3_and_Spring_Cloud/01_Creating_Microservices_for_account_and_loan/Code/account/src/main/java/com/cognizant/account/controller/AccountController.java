package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, Object> getAccount(@PathVariable String number) {
        Map<String, Object> accountDetails = new HashMap<>();
        accountDetails.put("number", number);
        accountDetails.put("type", "savings");
        accountDetails.put("balance", 234343);
        return accountDetails;
    }
}
