package com.mdr.mongo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("roles")
public class PredioMongo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3840781118768252484L;
	private String _id;
	private Integer id;
	private Integer prediosID;
	private String idGeo;
	private String rol;
	private String propietario;
	private BigDecimal areaHa;
	private String nombrePredio;
	private List<PerimetroMongo> perimetro;
	private BigDecimal escaINGR;
	private BigDecimal fechINGR;
	private String msLink;
	private String descComu;
	private String anoreaSII;
	private String lugarBN;
	private Integer codicomu;
	private String descClasif;
	private String ortoFoto;
	private String ortoImage;
	
	@Id
	public String get_id() {
		return _id;
	}
	public Integer getId() {
		return id;
	}

	public Integer getPrediosID() {
		return prediosID;
	}

	public String getIdGeo() {
		return idGeo;
	}

	public String getRol() {
		return rol;
	}

	public String getPropietario() {
		return propietario;
	}

	public BigDecimal getAreaHa() {
		return areaHa;
	}

	public String getNombrePredio() {
		return nombrePredio;
	}

	public List<PerimetroMongo> getPerimetro() {
		return perimetro;
	}

	public BigDecimal getEscaINGR() {
		return escaINGR;
	}

	public BigDecimal getFechINGR() {
		return fechINGR;
	}

	public String getMsLink() {
		return msLink;
	}

	public String getDescComu() {
		return descComu;
	}

	public String getAnoreaSII() {
		return anoreaSII;
	}

	public String getLugarBN() {
		return lugarBN;
	}

	public Integer getCodicomu() {
		return codicomu;
	}

	public String getDescClasif() {
		return descClasif;
	}

	public String getOrtoFoto() {
		return ortoFoto;
	}

	public String getOrtoImage() {
		return ortoImage;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPrediosID(Integer prediosID) {
		this.prediosID = prediosID;
	}

	public void setIdGeo(String idGeo) {
		this.idGeo = idGeo;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public void setAreaHa(BigDecimal areaHa) {
		this.areaHa = areaHa;
	}

	public void setNombrePredio(String nombrePredio) {
		this.nombrePredio = nombrePredio;
	}

	public void setPerimetro(List<PerimetroMongo> perimetro) {
		this.perimetro = perimetro;
	}

	public void setEscaINGR(BigDecimal escaINGR) {
		this.escaINGR = escaINGR;
	}

	public void setFechINGR(BigDecimal fechINGR) {
		this.fechINGR = fechINGR;
	}

	public void setMsLink(String msLink) {
		this.msLink = msLink;
	}

	public void setDescComu(String descComu) {
		this.descComu = descComu;
	}

	public void setAnoreaSII(String anoreaSII) {
		this.anoreaSII = anoreaSII;
	}

	public void setLugarBN(String lugarBN) {
		this.lugarBN = lugarBN;
	}

	public void setCodicomu(Integer codicomu) {
		this.codicomu = codicomu;
	}

	public void setDescClasif(String descClasif) {
		this.descClasif = descClasif;
	}

	public void setOrtoFoto(String ortoFoto) {
		this.ortoFoto = ortoFoto;
	}

	public void setOrtoImage(String ortoImage) {
		this.ortoImage = ortoImage;
	}


	public void set_id(String _id) {
		this._id = _id;
	}

}
