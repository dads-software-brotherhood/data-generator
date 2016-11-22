package mx.infotec.dads.model;

import java.io.Serializable;

import mx.infotec.dads.datagenerator.DataFactory;

public class Direccion implements Serializable {
	
	public Direccion(DataFactory dataFactory) {
		this.calle = dataFactory.getStreetName();
		this.numEx = dataFactory.getNumberBetween(0, 99);
		this.numInt = dataFactory.getNumberBetween(0, 99);
		this.colonia = dataFactory.getCity();
		this.delegacion = dataFactory.getCity();
		this.municipio = dataFactory.getCity();
		this.codigoPostal = dataFactory.getZipCode();
		this.entidad = dataFactory.getEntidad(0);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String calle;
	
	private int numEx;
	
	private int numInt;
	
	private String colonia;
	
	private String delegacion;
	
	private String municipio;
	
	private String codigoPostal;
	
	private Entidades entidad;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumEx() {
		return numEx;
	}

	public void setNumEx(int numEx) {
		this.numEx = numEx;
	}

	public int getNumInt() {
		return numInt;
	}

	public void setNumInt(int numInt) {
		this.numInt = numInt;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Entidades getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidades entidad) {
		this.entidad = entidad;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numEx=" + numEx + ", numInt=" + numInt + ", colonia=" + colonia
				+ ", delegacion=" + delegacion + ", municipio=" + municipio + ", codigoPostal=" + codigoPostal
				+ ", entidad=" + entidad + "]";
	}
	
	

}
