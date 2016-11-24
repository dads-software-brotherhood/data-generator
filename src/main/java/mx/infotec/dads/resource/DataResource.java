package mx.infotec.dads.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.infotec.dads.model.Direccion;
import mx.infotec.dads.model.Entidades;
import mx.infotec.dads.model.Persona;
import mx.infotec.dads.service.DataService;

@RestController
public class DataResource {
	
	@Autowired
	DataService dataService;
	
	@RequestMapping("/names")
	public String getName() {
		return dataService.getNames(1).get(0);
	}
	
	@RequestMapping("/names/{number}")
	public List<String> getNames(@PathVariable("number")int number){
		
		return dataService.getNames(number);
	}
	
	@RequestMapping("/last/names")
	public String getLastName() {
		return dataService.getLastName(1).get(0);
	}
	
	@RequestMapping("/last/names/{number}")
	public List<String> getLastName(@PathVariable("number")int number){
		
		return dataService.getLastName(number);
	}
	
	@RequestMapping("/persons")
	public Persona getPersona() {
		
		return dataService.generarPersonas(1).get(0);
	}
	
	@RequestMapping("/persons/{number}")
	public List<Persona> getPersonas(@PathVariable("number")int number) {
		
		return dataService.generarPersonas(number);
	}
	
	@RequestMapping("/address")
	public Direccion getDireccion() {
		
		return dataService.generarDirecciones(1).get(0);
	}
	
	@RequestMapping("/address/{number}")
	public List<Direccion> getDirecciones(@PathVariable("number")int number) {
		
		return dataService.generarDirecciones(number);
	}
	
	@RequestMapping("/rfcs")
	public String getRfc() {
		return dataService.getRfcs(1).get(0);
	}
	
	@RequestMapping("/rfcs/{number}")
	public List<String> getRfcs(@PathVariable("number")int number){
		
		return dataService.getRfcs(number);
	}
	
	@RequestMapping("/rfcs/moral")
	public String getRfcMoral() {
		return dataService.getRfcMorales(1).get(0);
	}
	
	@RequestMapping("/rfcs/moral/{number}")
	public List<String> getRfcMorales(@PathVariable("number")int number){
		
		return dataService.getRfcMorales(number);
	}

	@RequestMapping("/curps")
	public String getCurp() {
		return dataService.getCurp(1).get(0);
	}
	
	@RequestMapping("/curps/{number}")
	public List<String> getCurps(@PathVariable("number")int number){
		
		return dataService.getCurp(number);
	}
	
	@RequestMapping("/entidades")
	public List<Entidades> getEntidades() {
		
		return dataService.getEntidades(0);
	}
	
	@RequestMapping("/entidades/{id}")
	public Entidades getEntidad(@PathVariable("id")int id) {
		
		return dataService.getEntidades(id).get(0);
	}
	
	@RequestMapping("/emails")
	public String getEmail() {
		return dataService.getEmail(1).get(0);
	}
	
	@RequestMapping("/emails/{cantidad}")
	public List<String> getEmails(@PathVariable("cantidad")int cantidad) {
		
		return dataService.getEmail(cantidad);
	}
}
