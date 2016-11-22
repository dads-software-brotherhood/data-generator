package mx.infotec.dads.datagenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import mx.infotec.dads.datafactory.EntidadesDataValues;
import mx.infotec.dads.model.Entidades;

class DefaultEntidadesDataValues implements EntidadesDataValues {
	
	private Map<Integer, Entidades> entidadesMap = new TreeMap<>();
	private Random random = new Random();
	private int entidadLength = entidadesArr.length;

	public DefaultEntidadesDataValues() {
		for (int i = 0; i < entidadesArr.length; i++) {
			Entidades entidad = new Entidades();
			entidad.setId(entidadesArr[i][0]);
			entidad.setNombre(entidadesArr[i][1]);
			entidad.setAbreviatura(entidadesArr[i][2]);
			entidadesMap.put(Integer.parseInt(entidad.getId()), entidad);
		}
	}

	private static String[][] entidadesArr = { { "1", "Aguascalientes", "AS" }, { "2", "Baja California", "BC" },
			{ "3", "Baja California Sur", "BS" }, { "4", "Campeche", "CC" }, { "5", "Chiapas", "CS" },
			{ "6", "Chihuahua", "CH" }, { "7", "Coahuila", "CL" }, { "8", "Colima", "CM" },
			{ "9", "Distrito Federal", "DF" }, { "10", "Durango", "DG" }, { "11", "Guanajuato", "GT" },
			{ "12", "Guerrero", "GR" }, { "13", "Hidalgo", "HG" }, { "14", "Jalisco", "JC" }, { "15", "México", "MC" },
			{ "16", "Michoacan", "MN" }, { "17", "Morelos", "MS" }, { "18", "Nayarit", "NT" },
			{ "19", "Nuevo León", "NL" }, { "20", "Oaxaca", "OC" }, { "21", "Puebla", "PL" },
			{ "22", "Querétaro", "QT" }, { "23", "Quintana Roo", "QR" }, { "24", "San Luis Potosí", "SP" },
			{ "25", "Sinaloa", "SL" }, { "26", "Sonora", "SR" }, { "27", "Tabasco", "TC" }, { "28", "Tlaxcala", "TL" },
			{ "29", "Tamaulipas", "TS" }, { "30", "Veracruz", "VZ" }, { "31", "Yucatán", "YN" },
			{ "32", "Zacatecas", "ZS" } };

	@Override
	public Entidades getEntidad(int id) {
		while (id == 0) 
			id = random.nextInt(entidadLength);
		
		return entidadesMap.get(id);
	}

	@Override
	public String getNombreEntidad(int id) {
		while (id == 0)
			id = random.nextInt(entidadLength);
		
		return entidadesMap.get(id).getNombre();
	}

	@Override
	public String getAbreviaturaEntidad(int id) {
		while (id == 0)
			id = random.nextInt(entidadLength);

		return entidadesMap.get(id).getAbreviatura();
	}

	@Override
	public List<Entidades> getEntidades() {
		List<Entidades> listaEntidades = new ArrayList<>();
		for (Map.Entry<Integer, Entidades> entry : entidadesMap.entrySet()) {
			listaEntidades.add(entry.getValue());
		}
		return listaEntidades;
	}


}
