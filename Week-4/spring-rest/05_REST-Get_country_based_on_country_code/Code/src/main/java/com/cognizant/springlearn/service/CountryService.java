package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.model.CountryList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // ✅ updated

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.List;

@Service
public class CountryService {

    @Transactional
    public Country getCountry(String code) throws Exception {
        InputStream inputStream = this.getClass().getResourceAsStream("/country.xml");

        JAXBContext context = JAXBContext.newInstance(CountryList.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        CountryList countryList = (CountryList) unmarshaller.unmarshal(inputStream);

        List<Country> countries = countryList.getCountries();

        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new Exception("Country not found with code: " + code));
    }
}
