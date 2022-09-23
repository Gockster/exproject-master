package com.gdim.qualco.controllers;

import com.gdim.qualco.dao.*;
import com.gdim.qualco.entity.*;
import com.gdim.qualco.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/")
public class TheController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private ExpertService expertService;

    @Autowired
    ContinentsService continentsService;

    @Autowired
    GuestService guestService;

    @Autowired
    RegionService regionService;

    @Autowired
    CountryStatService countryStatService;

    @Autowired
    CountryLanguageService countryLanguageService;

    @Autowired
    LanguageService languageService;

    @Autowired
    SecondScreenService secondScreenService;

    @Autowired
    RegionAreaService regionAreaService;

    @GetMapping("/countries")
    public List<Countries> findAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/expert")
    public List<Expert> findAllExperts() {
        return expertService.getAll();
    }

    @GetMapping("/region/{regionName}")
    public List<Expert> findExpertByRegionName(@PathVariable String regionName) {
        return expertService.getExpertByRegionName(regionName);
    }

    @GetMapping("/search/{searchAttribute}")
    public List<Expert> findExpertBySearch(@PathVariable Optional searchAttribute) {
        return expertService.getExpertBySearch(searchAttribute);
    }

    @GetMapping("/regionId/{regionId}")
    public List<Expert> findExpertByRegionId(@PathVariable Long regionId) {
        return expertService.getExpertByRegionId(regionId);
    }

    @GetMapping("/continents")
    public List<Continents> findAllContinents() {
        return continentsService.getContinents();
    }

    @GetMapping("/regions")
    public List<Regions> showRegions() {
        return regionService.getRegions();
    }

    @GetMapping("/stats")
    public List<CountryStats> findCountryStats() {
        return countryStatService.getCountryStats();
    }

    @GetMapping("/country-languages")
    public List<CountryLanguages> findCountryLanguages() {
        return countryLanguageService.getCountryLanguages();
    }

    @GetMapping("/languages")
    public List<Languages> findAllLanguages() {
        return languageService.getLanguages();
    }

    @GetMapping("/countries/languages/{countryId}")
    public List<Languages> findLanguagesByCountry(@PathVariable int countryId) {
        return languageService.getLanguagesByCountry(countryId);
    }

    @GetMapping("/second")
    public List<SecondScreen> showSecondScreenData() {
        return secondScreenService.getSecondData();
    }

    @GetMapping("/areas")
    public List<RegionAreas> findAllAreas() {
        return regionAreaService.getAreas();
    }



}
