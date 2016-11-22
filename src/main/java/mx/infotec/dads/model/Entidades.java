package mx.infotec.dads.model;

import java.io.Serializable;

public class Entidades implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String nombre;
	
	private String abreviatura;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Override
	public String toString() {
		return "Entidades [id=" + id + ", nombre=" + nombre + ", abreviatura=" + abreviatura + "]";
	}
	
	
}
