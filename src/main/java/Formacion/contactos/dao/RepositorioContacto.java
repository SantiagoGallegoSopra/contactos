package Formacion.contactos.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import Formacion.contactos.entity.Contacto;

public interface RepositorioContacto extends JpaRepository<Contacto, Long> {

}
