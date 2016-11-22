package mx.infotec.dads.model;

import java.io.Serializable;
import java.util.Date;

import mx.infotec.dads.datagenerator.DataFactory;

public class Persona implements Serializable {
	
	public Persona(DataFactory dataFactory) {
		this.nombre = dataFactory.getFirstName();
		this.primerApellido = dataFactory.getLastName();
		this.segundoApellido = dataFactory.getLastName();
		this.curp = dataFactory.getCurp();
		this.rfc = dataFactory.getRfc();
		this.rfcMoral = dataFactory.getRfcMoral();
		this.fechaNac = dataFactory.getBirthDate();
		this.email = dataFactory.getEmailAddress();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	
	private String primerApellido;
	
	private String segundoApellido;
	
	private String curp;
	
	private String rfc;
	
	private String rfcMoral;
	
	private Date fechaNac;
	
	private String email;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getRfcMoral() {
		return rfcMoral;
	}

	public void setRfcMoral(String rfcMoral) {
		this.rfcMoral = rfcMoral;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", curp=" + curp + ", rfc=" + rfc + ", rfcMoral=" + rfcMoral + ", fechaNac="
				+ fechaNac + ", email=" + email + "]";
	}
	
	


}
