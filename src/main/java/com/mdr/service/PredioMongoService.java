package com.mdr.service;

import java.util.List;

import com.mdr.mongo.model.PredioMongo;

public interface PredioMongoService {

	public List<PredioMongo> findAll();

	void guardar(List<PredioMongo> predios);

	
}
