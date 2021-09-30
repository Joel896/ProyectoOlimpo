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
@Table (name="Servicios")
public class Servicio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idServicio;
	
	@ManyToOne
	@JoinColumn(name="idSucursal", nullable=false)
	private Sucursal sucursal;
	
	@Column(name="Servicio", nullable=false, length=50)
	private String Nombre;
	
	@Column(name="Descripcion", nullable=false, length=100)
	private String Descripcion;
	
	@ManyToOne
	@JoinColumn(name="idTipoServicio")
	private TipoServicio tiposervicio;

	@OneToMany(mappedBy="tipovehiculo",cascade=CascadeType.ALL)
	private Set<Tarifario> Tarifarios;
	
	@OneToMany(mappedBy="usuario",cascade=CascadeType.ALL)
	private Set<Calificacion> Calificaciones;

	public Servicio() {
		super();
	}

	public Servicio(int idServicio, Sucursal sucursal, String nombre, String descripcion, TipoServicio tiposervicio,
			Set<Tarifario> tarifarios, Set<Calificacion> calificaciones) {
		super();
		this.idServicio = idServicio;
		this.sucursal = sucursal;
		Nombre = nombre;
		Descripcion = descripcion;
		this.tiposervicio = tiposervicio;
		Tarifarios = tarifarios;
		Calificaciones = calificaciones;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
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

	public TipoServicio getTiposervicio() {
		return tiposervicio;
	}

	public void setTiposervicio(TipoServicio tiposervicio) {
		this.tiposervicio = tiposervicio;
	}

	public Set<Tarifario> getTarifarios() {
		return Tarifarios;
	}

	public void setTarifarios(Set<Tarifario> tarifarios) {
		Tarifarios = tarifarios;
	}

	public Set<Calificacion> getCalificaciones() {
		return Calificaciones;
	}

	public void setCalificaciones(Set<Calificacion> calificaciones) {
		Calificaciones = calificaciones;
	}
}