package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Distritos")
public class Distrito implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDistrito;
	
	@Column(name="Distrito", nullable=false, length=25)
	private String Nombre;

	public Distrito() {
		super();
	}

	public Distrito(int idDistrito, String nombre) {
		super();
		this.idDistrito = idDistrito;
		Nombre = nombre;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}	
