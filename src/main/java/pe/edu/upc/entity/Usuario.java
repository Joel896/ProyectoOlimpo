package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long DNI;
	
	@Column(name="Nombre", nullable=false, length=50)
	private String Nombre;
	
	@Column(name="Correo", nullable=false, length=50)
	private String Correo;
	
	@Column(name="Contraseña", nullable=false, length=50)
	private String Contrasenia;
	
	@Column(name="Celular", nullable=false)
	private int Celular;
	
	@Column(name="EsEmpresa", nullable=false)
	private boolean EsEmpresa;
	
	@ManyToOne
	@JoinColumn(name="CSucursal", nullable=true)
	private int Sucursal;

	public Usuario() {
		super();
	}

	public Usuario(long dNI, String nombre, String correo, String contrasenia, int celular, boolean esEmpresa,
			int sucursal) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Correo = correo;
		Contrasenia = contrasenia;
		Celular = celular;
		EsEmpresa = esEmpresa;
		Sucursal = sucursal;
	}

	public long getDNI() {
		return DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public int getCelular() {
		return Celular;
	}

	public void setCelular(int celular) {
		Celular = celular;
	}

	public boolean isEsEmpresa() {
		return EsEmpresa;
	}

	public void setEsEmpresa(boolean esEmpresa) {
		EsEmpresa = esEmpresa;
	}

	public int getSucursal() {
		return Sucursal;
	}

	public void setSucursal(int sucursal) {
		Sucursal = sucursal;
	}
}
