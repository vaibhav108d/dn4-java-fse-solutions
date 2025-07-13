package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CountryController {


    @GetMapping("/countries")
    public ArrayList<Country> getAllCountries() {
        ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");
        ArrayList <Country> countries= (ArrayList <Country>) context.getBean("countryList");
        return countries;

    }



}
