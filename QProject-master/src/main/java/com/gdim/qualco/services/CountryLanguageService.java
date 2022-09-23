package com.gdim.qualco.services;

import com.gdim.qualco.dao.CountryLanguagesRepository;
import com.gdim.qualco.entity.CountryLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryLanguageService {

    @Autowired
    private CountryLanguagesRepository countryLanguagesRepository;

    public List<CountryLanguages> getCountryLanguages(){
        return countryLanguagesRepository.findAll();
    }
}
