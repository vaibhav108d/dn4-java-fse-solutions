package com.cognizant.springlearn.model;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "country-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryList {

    @XmlElement(name = "country")
    private List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
