package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="EstadosSolicitud")
public class EstadoSolicitud implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEstadoSolicitud;
	
	@Column(name="Estado", nullable=false, length=30)
	private String Tipo;

	public EstadoSolicitud() {
		super();
	}

	public EstadoSolicitud(int idEstadoSolicitud, String tipo) {
		super();
		this.idEstadoSolicitud = idEstadoSolicitud;
		Tipo = tipo;
	}

	public int getIdEstadoSolicitud() {
		return idEstadoSolicitud;
	}

	public void setIdEstadoSolicitud(int idEstadoSolicitud) {
		this.idEstadoSolicitud = idEstadoSolicitud;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
}