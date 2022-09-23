package com.gdim.qualco.services;

import com.gdim.qualco.dao.ExpertRepository;
import com.gdim.qualco.entity.Expert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpertService {

    @Autowired
    private ExpertRepository expertRepository;

    public List<Expert> getExpertBySearch(Optional search){
        return expertRepository.findBySearch(search);
    }

    public List<Expert> getExpertByRegionName(String regionName){
       return expertRepository.findByRegionName(regionName);
    }

    public List<Expert> getAll(){
        return expertRepository.findAll();
    }

    public List<Expert> getExpertByRegionId(Long regionId){
        return expertRepository.findByRegionId(regionId);
    }


}
