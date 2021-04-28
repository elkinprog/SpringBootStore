package com.elkinprog.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elkinprog.api.model.ModelStore;
import com.elkinprog.api.repositories.StoreRepository;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })


public class Storecontroller {
	@Autowired
	public StoreRepository store_repository;
	

	
	@GetMapping("/Show")
	public List<ModelStore> getAllStore() {
		return  store_repository.findAll();
	}


	@PostMapping("/Create")
	public ModelStore create (@Validated @RequestBody ModelStore p ) {
	return store_repository.insert(p);		
	} 
	
	
	@PutMapping("/Update/{Id}")
	public ModelStore update(@PathVariable String Id, @Validated @RequestBody ModelStore pr) {
		return store_repository.save(pr);
	}
	
	

	
	@DeleteMapping("/Delete/{Id}")
	public void delete(@PathVariable String Id) {
		store_repository.deleteById(Id);
	}
	
	

	
	
	
	
	
	


	
	
	
	
	

}


















































