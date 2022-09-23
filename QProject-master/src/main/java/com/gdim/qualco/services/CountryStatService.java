package com.gdim.qualco.services;

import com.gdim.qualco.dao.CountryStatsRepository;
import com.gdim.qualco.entity.CountryStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryStatService {

    @Autowired
    private CountryStatsRepository countryStatsRepository;

    public List<CountryStats> getCountryStats(){
        return countryStatsRepository.findAll();
    }
}
