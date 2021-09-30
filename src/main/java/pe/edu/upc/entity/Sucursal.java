package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="Sucursales")
public class Sucursal implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;
	
	@ManyToOne
	@JoinColumn(name="RUCEmpresa", nullable=false)
	private Empresa empresa;
	
	@Column(name="Direccion", nullable=false, length=50)
	private String Direccion;
	
	@ManyToOne
	@JoinColumn(name="idDistrito", nullable=false)
	private Distrito distrito;
	
	@Column(name="Telefono", nullable=false)
	private int Telefono;
	
	@OneToMany(mappedBy="dia", cascade=CascadeType.ALL)
	private Set<Horario> Horarios;
	

	public Sucursal() {
		super();
	}

	public Sucursal(int idSucursal, Empresa empresa, String direccion, Distrito distrito, int telefono,
			Set<Horario> horarios) {
		super();
		this.idSucursal = idSucursal;
		this.empresa = empresa;
		Direccion = direccion;
		this.distrito = distrito;
		Telefono = telefono;
		Horarios = horarios;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

	public Set<Horario> getHorarios() {
		return Horarios;
	}

	public void setHorarios(Set<Horario> horarios) {
		Horarios = horarios;
	}
}
