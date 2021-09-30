package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name="Calificaciones")
public class Calificacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String Id; 
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="idServicio")
	private Servicio servicio;
	
	@Column(name="Puntos", nullable=false)
	private int Puntos;
	
	@Column(name="Comentario", nullable=false, length=100)
	private String Comentario;
	
	private Date FechaComentario;

	public Calificacion() {
		super();
	}

	public Calificacion(Usuario usuario, Servicio servicio, int puntos, String comentario,
			Date fechaComentario) {
		super();
		Id = usuario.getDNI() + "_" + servicio.getIdServicio();
		this.usuario = usuario;
		this.servicio = servicio;
		Puntos = puntos;
		Comentario = comentario;
		FechaComentario = fechaComentario;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public int getPuntos() {
		return Puntos;
	}

	public void setPuntos(int puntos) {
		Puntos = puntos;
	}

	public String getComentario() {
		return Comentario;
	}

	public void setComentario(String comentario) {
		Comentario = comentario;
	}

	public Date getFechaComentario() {
		return FechaComentario;
	}

	public void setFechaComentario(Date fechaComentario) {
		FechaComentario = fechaComentario;
	}
}