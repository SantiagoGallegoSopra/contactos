package Formacion.contactos.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Formacion.contactos.dao.RepositorioContacto;
import Formacion.contactos.entity.Contacto;

@Service
public class ContactService {
  @Autowired
  RepositorioContacto dao;
   
  public Contacto save(Contacto contact){
      return dao.saveAndFlush(contact);
  }
}