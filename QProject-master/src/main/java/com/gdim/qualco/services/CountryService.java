package com.gdim.qualco.services;

import com.gdim.qualco.dao.CountriesRepository;
import com.gdim.qualco.entity.Countries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountriesRepository countriesRepository;

    public List<Countries> getCountriesById(int countryId){
      return countriesRepository.findByCountryId(countryId);
    }

    public List<Countries> getAllCountries() {
        return countriesRepository.findAll();
    }
}
