package com.elkinprog.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.elkinprog.api.model.ModelStore;


@Repository
public interface StoreRepository extends MongoRepository<ModelStore, String> {
	
	
	

}
