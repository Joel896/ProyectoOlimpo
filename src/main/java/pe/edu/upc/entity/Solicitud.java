package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name="Solicitudes")
public class Solicitud implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSolicitud;
	
	@ManyToOne
	@JoinColumn(name="DNICliente", nullable=false)
	private Usuario DNIUsuario;

	@ManyToOne
	@JoinColumn(name="idServicio", nullable=false)
	private Servicio servicio;

	private Date fechaCreacion;
	
	private Date fechaActualizacion;
	
	private Date fechaSolicitud;
	
	@Column(name="EsDelivery", nullable=false)
	private boolean EsDelivery;
	
	@Column(name="Observacion", nullable=false, length=100)
	private String Observacion;
	
	@ManyToOne
	@JoinColumn(name="idEstadoSolicitud", nullable=false)
	private EstadoSolicitud Estado;

	public Solicitud() {
		super();
	}

	public Solicitud(int idSolicitud, Usuario dNIUsuario, Servicio servicio, Date fechaCreacion,
			Date fechaActualizacion, Date fechaSolicitud, boolean esDelivery, String observacion,
			EstadoSolicitud estado) {
		super();
		this.idSolicitud = idSolicitud;
		DNIUsuario = dNIUsuario;
		this.servicio = servicio;
		this.fechaCreacion = fechaCreacion;
		this.fechaActualizacion = fechaActualizacion;
		this.fechaSolicitud = fechaSolicitud;
		EsDelivery = esDelivery;
		Observacion = observacion;
		Estado = estado;
	}

	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public Usuario getDNIUsuario() {
		return DNIUsuario;
	}

	public void setDNIUsuario(Usuario dNIUsuario) {
		DNIUsuario = dNIUsuario;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public boolean isEsDelivery() {
		return EsDelivery;
	}

	public void setEsDelivery(boolean esDelivery) {
		EsDelivery = esDelivery;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public EstadoSolicitud getEstado() {
		return Estado;
	}

	public void setEstado(EstadoSolicitud estado) {
		Estado = estado;
	}
}
