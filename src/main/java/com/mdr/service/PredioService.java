package com.mdr.service;

import java.util.List;

import com.mdr.sql.model.Predio;

public interface PredioService {

	void guardar(Predio predio);

	List<Predio> findAll();

}
