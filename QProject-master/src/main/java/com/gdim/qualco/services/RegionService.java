package com.gdim.qualco.services;

import com.gdim.qualco.dao.RegionsRepository;
import com.gdim.qualco.entity.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionsRepository regionsRepository;

    public List<Regions> getRegions(){
        return regionsRepository.findAll();
    }


}
