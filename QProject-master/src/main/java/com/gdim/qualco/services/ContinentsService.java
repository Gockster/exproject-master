package com.gdim.qualco.services;

import com.gdim.qualco.dao.ContinentsRepository;
import com.gdim.qualco.entity.Continents;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentsService {

    private ContinentsRepository continentsRepository;

    public List<Continents> getContinents(){
        return continentsRepository.findAll();
    }
}
