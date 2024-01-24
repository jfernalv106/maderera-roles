package com.mdr.mongo.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PerimetroMongo implements Serializable  {
	    /**
	 * 
	 */
	private static final long serialVersionUID = -937695027500540801L;
		private Integer id;
	    private Integer predio;
	    private BigDecimal latitud;
	    private BigDecimal longitud;
	    
	    
		public Integer getId() {
			return id;
		}
		public Integer getPredio() {
			return predio;
		}
		public BigDecimal getLatitud() {
			return latitud;
		}
		public BigDecimal getLongitud() {
			return longitud;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public void setPredio(Integer predio) {
			this.predio = predio;
		}
		public void setLatitud(BigDecimal latitud) {
			this.latitud = latitud;
		}
		public void setLongitud(BigDecimal longitud) {
			this.longitud = longitud;
		}
	    
	    
}
