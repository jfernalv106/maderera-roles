package com.mdr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdr.sql.model.Predio;

public interface PredioDao  extends JpaRepository<Predio, Integer>{

}
