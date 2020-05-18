package Formacion.contactos.rest;


//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Formacion.contactos.entity.Contacto;
import Formacion.contactos.service.ContactService;


//import java.lang.String;
@RestController
public class ContactoApi {
	@Autowired
	ContactService contactService;
	@RequestMapping(value="/contacto", method=RequestMethod.POST)
	public Contacto updateOrSave(@RequestBody Contacto contacto){
	    return contactService.save(contacto);
	}
	
	@RequestMapping(value="/contacto", method=RequestMethod.GET)
	public Contacto getById(){
        return new Contacto( 1,"Rompetechos","Ibañez", "Susaeta", "111111111H","13  rue del percebe");
    }
}	