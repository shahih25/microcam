package com.example.microcam.repository;

import com.example.microcam.model.MicroCam;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface MicroCamRepository extends MongoRepository<MicroCam, String> {
}
