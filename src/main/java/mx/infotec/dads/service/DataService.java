package mx.infotec.dads.service;

import java.util.List;

import mx.infotec.dads.model.Direccion;
import mx.infotec.dads.model.Entidades;
import mx.infotec.dads.model.Persona;

public interface DataService {
	
	List<Persona> generarPersonas(int cantidad);
	
	List<Direccion> generarDirecciones(int cantidad);
	
	List<String> getNames(int cantidad);
	
	List<String> getLastName(int cantidad);
	
	List<String> getRfcs(int cantidad);
	
	List<String> getRfcMorales(int cantidad);
	
	List<String> getCurp(int cantidad);
	
	List<Entidades> getEntidades(int id);
	
	List<String> getEmail(int cantidad);

}
