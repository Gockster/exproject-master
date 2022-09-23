package com.gdim.qualco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdim.qualco.entity.Languages;

import java.util.List;

public interface LanguagesRepository extends JpaRepository<Languages, Integer>{
    List<Languages> findByCountries_CountryId(int countryId);



}
