package com.gdim.qualco.services;

import com.gdim.qualco.dao.CountryLanguagesRepository;
import com.gdim.qualco.dao.LanguagesRepository;
import com.gdim.qualco.entity.CountryLanguages;
import com.gdim.qualco.entity.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguagesRepository languagesRepository;

    public List<Languages> getLanguages(){
        return languagesRepository.findAll();
    }

    public List<Languages> getLanguagesByCountry(int countryId){
        return languagesRepository.findByCountries_CountryId(countryId);
    }

}


