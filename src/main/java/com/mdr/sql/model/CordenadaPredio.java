package com.mdr.sql.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.mdr.utils.Constantes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = CordenadaPredio.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "cordenadas", schema = Constantes.ECHEMA)
public class CordenadaPredio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5016558121130270452L;
	private Integer id;
	private Predio predio;
	private BigDecimal latitud;
	private BigDecimal longitud;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_cordenadas")
	@SequenceGenerator(name = "sequence_cordenadas", sequenceName = "seq_cordenadas", allocationSize = 1, schema = Constantes.ECHEMA, catalog = Constantes.CATALOGO_DB)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_predio", nullable = false)
	public Predio getPredio() {
		return predio;
	}

	@Column(name = "latitud")
	public BigDecimal getLatitud() {
		return latitud;
	}

	@Column(name = "longitud")
	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPredio(Predio predio) {
		this.predio = predio;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

}
