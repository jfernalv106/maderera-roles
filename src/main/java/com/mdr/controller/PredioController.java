package com.mdr.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdr.mongo.model.PredioMongo;
import com.mdr.service.PredioMongoService;
import com.mdr.service.PredioService;
import com.mdr.sql.model.Predio;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api-predio")
public class PredioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7062445658591595979L;

	@Autowired
	PredioService predioService;
	
	@Autowired
	PredioMongoService	predioMongoService;

	@PostMapping("/predio")
	public ResponseEntity<?> guardaPredio(@RequestBody Predio predio) {
		
		
		try {
			
			predio.getPerimetro().forEach((cr) -> {
					cr.setPredio(predio);
				});

				predioService.guardar(predio);
			

			return new ResponseEntity<>(predio, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/predios")
	public ResponseEntity<?> guardaPredios(@RequestBody List<Predio> predios) {

		try {
			predios.forEach((pr) -> {
				pr.getPerimetro().forEach((cr) -> {
					cr.setPredio(pr);
				});
				
				predioService.guardar(pr);
			});
			
			return new ResponseEntity<>(predios, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/predios-mongo")
	public ResponseEntity<?> getPrediosMongo() {
		System.out.print("Cargando Consulta Mongo");
		try {

			List<PredioMongo> predios = new ArrayList<PredioMongo>();
			predios.addAll(predioMongoService.findAll());
			if (predios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(predios, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/predios")
	public ResponseEntity<?> getPredios() {
		try {
			
			List<Predio> predios = new ArrayList<Predio>();
			predios.addAll(predioService.findAll());
			if (predios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(predios, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
