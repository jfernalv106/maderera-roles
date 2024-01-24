package com.mdr.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mdr.mongo.model.PredioMongo;

public interface PredioMongoDao extends MongoRepository<PredioMongo, String> {

}
