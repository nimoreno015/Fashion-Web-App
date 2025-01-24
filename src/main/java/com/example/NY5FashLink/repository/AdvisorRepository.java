package com.example.NY5FashLink.repository;

import com.example.NY5FashLink.model.Advisor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvisorRepository extends MongoRepository<Advisor, String> {

    //Custom queries

}
