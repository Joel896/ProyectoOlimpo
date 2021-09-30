package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="Favoritos")
public class Favorito implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	String idFavorito;
	
	@ManyToOne
	@JoinColumn
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn (nullable=true)
	private Servicio servicio;

	public Favorito() {
		super();
	}

	public Favorito(Usuario usuario, Servicio servicio) {
		super();
		idFavorito = usuario.getDNI() + "_" + servicio.getIdServicio();
		this.usuario = usuario;
		this.servicio = servicio;
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

	public String getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(String idFavorito) {
		this.idFavorito = idFavorito;
	}
}
