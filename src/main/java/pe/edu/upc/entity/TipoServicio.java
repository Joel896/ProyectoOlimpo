package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name="TiposServicio")
public class TipoServicio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoServicio;
	
	@Column(name="TipoServicio", nullable=false, length=30)
	private String Tipo;

	public TipoServicio() {
		super();
	}

	public TipoServicio(int idTipoServicio, String tipo) {
		super();
		this.idTipoServicio = idTipoServicio;
		Tipo = tipo;
	}

	public int getIdTipoServicio() {
		return idTipoServicio;
	}

	public void setIdTipoServicio(int idTipoServicio) {
		this.idTipoServicio = idTipoServicio;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}	
}
