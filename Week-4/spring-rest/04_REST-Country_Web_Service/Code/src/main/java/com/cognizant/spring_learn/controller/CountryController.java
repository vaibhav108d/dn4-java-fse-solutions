package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.models.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class CountryController {
    ApplicationContext context= new ClassPathXmlApplicationContext("country.xml");
    Country country= (Country) context.getBean("country");

    @GetMapping("/country")
    public Country getCountryIndia()
    {
        return country;
    }

    @GetMapping("/countries")
    public ArrayList<Country> getAllCountries() {
        return (ArrayList<Country>) context.getBean("countryList");
    }

//    @GetMapping("/countries/{code}")
//    public getCountry(String code){
//
//    }

}
