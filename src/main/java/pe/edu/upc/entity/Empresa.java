package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Empresas")
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	private long RUC;
	
	@Column(name="Empresa", nullable=false, length=30)
	private String Nombre;
	
	@Column(name="Descripcion", nullable=false, length=100)
	private String Descripcion;
	
	@Column(name="Correo", nullable=false, length=20)
	private String Correo;

	public Empresa() {
		super();
	}

	public Empresa(long rUC, String nombre, String descripcion, String correo) {
		super();
		RUC = rUC;
		Nombre = nombre;
		Descripcion = descripcion;
		Correo = correo;
	}

	public long getRUC() {
		return RUC;
	}

	public void setRUC(long rUC) {
		RUC = rUC;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}
}
