package Formacion.contactos.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contacto implements Serializable {
private static final long serialVersionUID = 4894729030347835498L;
	
		 public Contacto(long id, String nombre, String apellido1, String apellido2, String dNI, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		Apellido1 = apellido1;
		Apellido2 = apellido2;
		DNI = dNI;
		this.direccion = direccion;
		 }
		 
		 public Contacto(){	
			}
		 
	@Id
    @GeneratedValue
		long id;
		 String nombre;
		 String Apellido1;
		 String Apellido2;
		 String DNI;
		 String direccion;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido1() {
			return Apellido1;
		}
		public void setApellido1(String apellido1) {
			Apellido1 = apellido1;
		}
		public String getApellido2() {
			return Apellido2;
		}
		public void setApellido2(String apellido2) {
			Apellido2 = apellido2;
		}
		public String getDNI() {
			return DNI;
		}
		public void setDNI(String dNI) {
			DNI = dNI;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("person [id=");
			builder.append(id);
			builder.append(", nombre=");
			builder.append(nombre);
			builder.append(", Apellido1=");
			builder.append(Apellido1);
			builder.append(", Apellido2=");
			builder.append(Apellido2);
			builder.append(", DNI=");
			builder.append(DNI);
			builder.append(", direccion=");
			builder.append(direccion);
			builder.append("]");
			return builder.toString();
		}	
}
