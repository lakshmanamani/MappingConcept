package com.spring.mappingconcept.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mappingconcept.Model.Photography;

public interface PhotographyRepo extends JpaRepository<Photography, Integer> {

	
}
