package mx.infotec.dads.datagenerator;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import mx.infotec.dads.datagenerator.DataFactory;
import mx.infotec.dads.model.Direccion;
import mx.infotec.dads.model.Entidades;
import mx.infotec.dads.model.Persona;

public class DataFactoryChangesTest {
	
	private DataFactory dataFactory;
	@Before
	public void init() {
		dataFactory = new DataFactory();
	}
	
	@Test
	public void validaEntidades() {
		List<Entidades> entidades = dataFactory.getEntidades();
		assertTrue(entidades.size()>0);
		for (Entidades	item : entidades) {
			System.out.println(item.toString());
			System.out.println(dataFactory.getAbreviaturaEntidad(0));
		}
	}
	
	@Test
	public void validatePersonas() {
		
		Persona persona = null;
		persona = dataFactory.getPersona();
		assertTrue(persona != null);
		System.out.println(persona.toString());
		
	}
	
	@Test
	public void validateDireccion() {
		Direccion direccion = null;
		direccion = dataFactory.getDireccion();
		assertTrue(direccion != null);
		System.out.println(direccion.toString());
	}
}
