package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name="TiposVehiculo")
public class TipoVehiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTipoVehiculo;
	
	@Column(name="TipoVehiculo", nullable=false, length=30)
	private String Tipo;
	
	@OneToMany(mappedBy="servicio", cascade=CascadeType.ALL)
	private Set<Tarifario> Tarifarios;

	public TipoVehiculo() {
		super();
	}

	public TipoVehiculo(int idTipoVehiculo, String tipo, Set<Tarifario> tarifarios) {
		super();
		this.idTipoVehiculo = idTipoVehiculo;
		Tipo = tipo;
		Tarifarios = tarifarios;
	}

	public int getIdTipoVehiculo() {
		return idTipoVehiculo;
	}

	public void setIdTipoVehiculo(int idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Set<Tarifario> getTarifarios() {
		return Tarifarios;
	}

	public void setTarifarios(Set<Tarifario> tarifarios) {
		Tarifarios = tarifarios;
	}
}