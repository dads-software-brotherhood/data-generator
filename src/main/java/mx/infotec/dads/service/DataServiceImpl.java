package mx.infotec.dads.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mx.infotec.dads.datagenerator.DataFactory;
import mx.infotec.dads.model.Direccion;
import mx.infotec.dads.model.Entidades;
import mx.infotec.dads.model.Persona;

@Service()
@Qualifier("dataService")
public class DataServiceImpl implements DataService {
	
	private DataFactory dataFactory;
	
	@PostConstruct
	private void init() {
		dataFactory = new DataFactory();

	}
	

	@Override
	public List<Persona> generarPersonas(int cantidad) {
		List<Persona> personas = new ArrayList<>();
		
		for (int i = 0; i < cantidad; i++) {
			personas.add(dataFactory.getPersona());
		}
		return personas;
	}

	@Override
	public List<Direccion> generarDirecciones(int cantidad) {
		List<Direccion> direcciones = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			direcciones.add(dataFactory.getDireccion());
		}
		return direcciones;
	}

	@Override
	public List<String> getNames(int cantidad) {
		List<String> names = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			names.add(dataFactory.getFirstName());
		}
		return names;
	}
	
	@Override
	public List<String> getLastName(int cantidad) {
		List<String> lastNames = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			lastNames.add(dataFactory.getLastName());
		}
		return lastNames;
	}

	@Override
	public List<String> getRfcs(int cantidad) {
		List<String> rfcs = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			rfcs.add(dataFactory.getRfc());
		}
		return rfcs;
	}

	@Override
	public List<String> getRfcMorales(int cantidad) {
		List<String> rfcMorales = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			rfcMorales.add(dataFactory.getRfcMoral());
		}
		return rfcMorales;
	}

	@Override
	public List<String> getCurp(int cantidad) {
		List<String> curps = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			curps.add(dataFactory.getCurp());
		}
		return curps;
	}

	@Override
	public List<Entidades> getEntidades(int id) {
		List<Entidades> entidades;
		if (id > 0) {
			entidades = new ArrayList<>();
			entidades.add(dataFactory.getEntidad(id));
			return entidades;
		} else { 
			return dataFactory.getEntidades();
		}
	}

	@Override
	public List<String> getEmail(int cantidad) {
		List<String> mails = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			mails.add(dataFactory.getEmailAddress());
		}
		return mails;
	}

}
