package com.mdr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdr.dao.PredioMongoDao;
import com.mdr.mongo.model.PredioMongo;
import com.mdr.service.PredioMongoService;

import jakarta.transaction.Transactional;

@Service
public class PredioMongoServiceImpl implements PredioMongoService{

	@Autowired
	PredioMongoDao predioMongoDao;
	
	@Transactional
	@Override
	public List<PredioMongo> findAll(){
		return predioMongoDao.findAll();
	}
	@Transactional
	@Override
	public void guardar(List<PredioMongo> predios) {
		predioMongoDao.saveAll(predios);
	}
}
