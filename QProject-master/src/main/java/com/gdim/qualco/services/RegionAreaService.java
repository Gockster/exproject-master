package com.gdim.qualco.services;

import com.gdim.qualco.dao.RegionAreasRepository;
import com.gdim.qualco.entity.RegionAreas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionAreaService {

    @Autowired
    private RegionAreasRepository regionAreasRepository;

    public List<RegionAreas> getAreas(){
        return regionAreasRepository.findAll();
    }


}
