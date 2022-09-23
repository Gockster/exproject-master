package com.gdim.qualco.services;

import com.gdim.qualco.dao.SecondScreenRepository;
import com.gdim.qualco.entity.SecondScreen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondScreenService {

    @Autowired
    private SecondScreenRepository secondScreenRepository;

    public List<SecondScreen> getSecondData(){
        return secondScreenRepository.findAll();
    }
}
