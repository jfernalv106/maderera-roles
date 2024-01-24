package com.mdr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdr.dao.PredioDao;
import com.mdr.service.PredioService;
import com.mdr.sql.model.Predio;

import jakarta.transaction.Transactional;

@Service
public class PredioServiceImpl implements PredioService{

	@Autowired
	PredioDao predioDao;
	
	@Transactional
	@Override
	public void guardar(Predio predio) {
		predioDao.save(predio);
	}
	
	@Transactional
	@Override
	public List<Predio> findAll(){
		return predioDao.findAll();
	}
}
