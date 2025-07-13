package com.cognizant.orm_learn.service;


import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country getCountry(String code){
        Optional<Country> result = countryRepository.findById(code);
        return  result.orElse(null);
    }

    public List<Country> getCountryByKeyword(String keyword){
        return countryRepository.findByNameContaining(keyword);
    }
    @Transactional
    public List<Country> getAllCountries()
    {
        return countryRepository.findAll();
    }
}
