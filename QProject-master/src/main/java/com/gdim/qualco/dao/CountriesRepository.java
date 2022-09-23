package com.gdim.qualco.dao;

import com.gdim.qualco.entity.Countries;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
//@RepositoryRestResource(collectionResourceRel = "countries", path="countries")
public interface CountriesRepository extends JpaRepository<Countries, Integer> {

// Page<Countries> findByCountryId(@Param("id") Integer id, Pageable pageable);
 List<Countries> findByName(String name);
 Countries findByArea(int area);

 @Query("select c from Countries c where c.countryId = ?1")
 List<Countries> findByCountryId(int countryId);


}
