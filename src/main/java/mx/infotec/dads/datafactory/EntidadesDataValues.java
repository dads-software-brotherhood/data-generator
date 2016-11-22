package mx.infotec.dads.datafactory;

import java.util.List;

import mx.infotec.dads.model.Entidades;

public interface EntidadesDataValues {
	
	Entidades getEntidad(int id);
	
	String getNombreEntidad(int id);
	
	String getAbreviaturaEntidad(int id);
	
	List<Entidades> getEntidades();
}
