package com.spring.mappingconcept.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mappingconcept.Model.Additionalmodel;

public interface AdditionalRepo extends JpaRepository<Additionalmodel, Integer> {

}
