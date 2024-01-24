package com.mdr.sql.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.mdr.utils.Constantes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Predio.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "predios", schema = Constantes.ECHEMA)
public class Predio {
	private Integer id;
	private String idGeo;
	private String rol;
	private Integer fID;
	private String propietario;
	private BigDecimal areaHa;
	private String nombrePredio;
	private List<CordenadaPredio> perimetro;
	private Integer escaINGR;
	private Integer fechINGR;
	private String msLink;
	private String descComu;
	private String anoreaSII;
	private String lugarBN;
	private Integer codicomu;
	private String descClasif;
	private String ortoFoto;
	private String ortoImage;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_predio")
	@SequenceGenerator(name = "sequence_predio", sequenceName = "seq_predio", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	@Column(name = "id_geo")
	public String getIdGeo() {
		return idGeo;
	}
	@Column(name = "rol")
	public String getRol() {
		return rol;
	}

	@Column(name = "f_id")
	public Integer getfID() {
		return fID;
	}

	@Column(name = "propietario")
	public String getPropietario() {
		return propietario;
	}

	@Column(name = "area_ha")
	public BigDecimal getAreaHa() {
		return areaHa;
	}

	@Column(name = "nombre_predio")
	public String getNombrePredio() {
		return nombrePredio;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "predio", orphanRemoval = true, cascade = CascadeType.ALL)
	public List<CordenadaPredio> getPerimetro() {
		return perimetro;
	}

	@Column(name = "esca_ingr")
	public Integer getEscaINGR() {
		return escaINGR;
	}

	@Column(name = "fech_ingr")
	public Integer getFechINGR() {
		return fechINGR;
	}

	@Column(name = "ms_link")
	public String getMsLink() {
		return msLink;
	}

	@Column(name = "desc_comu")
	public String getDescComu() {
		return descComu;
	}

	@Column(name = "anorea_sii")
	public String getAnoreaSII() {
		return anoreaSII;
	}

	@Column(name = "lugar_bn")
	public String getLugarBN() {
		return lugarBN;
	}

	@Column(name = "codi_comu")
	public Integer getCodicomu() {
		return codicomu;
	}

	@Column(name = "desc_clasif")
	public String getDescClasif() {
		return descClasif;
	}

	@Column(name = "orto_foto")
	public String getOrtoFoto() {
		return ortoFoto;
	}

	@Column(name = "orto_image")
	public String getOrtoImage() {
		return ortoImage;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public void setfID(Integer fID) {
		this.fID = fID;
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

	public void setPerimetro(List<CordenadaPredio> perimetro) {
		this.perimetro = perimetro;
	}

	public void setEscaINGR(Integer escaINGR) {
		this.escaINGR = escaINGR;
	}

	public void setFechINGR(Integer fechINGR) {
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
	public void setIdGeo(String idGeo) {
		this.idGeo = idGeo;
	}

}
