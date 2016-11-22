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
	
	@RequestMapping("/name")
	public String getName() {
		return dataService.getNames(1).get(0);
	}
	
	@RequestMapping("/name/{number}")
	public List<String> getNames(@PathVariable("number")int number){
		
		return dataService.getNames(number);
	}
	
	@RequestMapping("/last/name")
	public String getLastName() {
		return dataService.getLastName(1).get(0);
	}
	
	@RequestMapping("/last/name/{number}")
	public List<String> getLastName(@PathVariable("number")int number){
		
		return dataService.getLastName(number);
	}
	
	@RequestMapping("/person")
	public Persona getPersona() {
		
		return dataService.generarPersonas(1).get(0);
	}
	
	@RequestMapping("/person/{number}")
	public List<Persona> getPersonas(@PathVariable("number")int number) {
		
		return dataService.generarPersonas(number);
	}
	
	@RequestMapping("/direction")
	public Direccion getDireccion() {
		
		return dataService.generarDirecciones(1).get(0);
	}
	
	@RequestMapping("/direction/{number}")
	public List<Direccion> getDirecciones(@PathVariable("number")int number) {
		
		return dataService.generarDirecciones(number);
	}
	
	@RequestMapping("/rfc")
	public String getRfc() {
		return dataService.getRfcs(1).get(0);
	}
	
	@RequestMapping("/rfc/{number}")
	public List<String> getRfcs(@PathVariable("number")int number){
		
		return dataService.getRfcs(number);
	}
	
	@RequestMapping("/rfc/moral")
	public String getRfcMoral() {
		return dataService.getRfcMorales(1).get(0);
	}
	
	@RequestMapping("/rfc/moral/{number}")
	public List<String> getRfcMorales(@PathVariable("number")int number){
		
		return dataService.getRfcMorales(number);
	}

	@RequestMapping("/curp")
	public String getCurp() {
		return dataService.getCurp(1).get(0);
	}
	
	@RequestMapping("/curp/{number}")
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
	
	@RequestMapping("/email")
	public String getEmail() {
		return dataService.getEmail(1).get(0);
	}
	
	@RequestMapping("/email/{cantidad}")
	public List<String> getEmails(@PathVariable("cantidad")int cantidad) {
		
		return dataService.getEmail(cantidad);
	}
}
