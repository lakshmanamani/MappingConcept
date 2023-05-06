package com.spring.mappingconcept.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mappingconcept.Model.Photography;
import com.spring.mappingconcept.Repo.PhotographyRepo;

@RestController 
public class PhotographyController {
	@Autowired
	private PhotographyRepo phorepository;
	@PostMapping("/Savedet")
	public String savePhotography(@RequestBody Photography phoData) {
		phorepository.save(phoData);
		return "Data saved";
	}
	@GetMapping("/getData")
	public List<Photography> getPhotography() {
		return this.phorepository.findAll();
	}

}
