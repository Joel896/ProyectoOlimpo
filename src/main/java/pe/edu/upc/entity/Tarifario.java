package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name="Tarifarios")
public class Tarifario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String idTarifario;
	
	@ManyToOne
	@JoinColumn(name="idServicio")
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="idTipoVehiculo")
	private TipoVehiculo tipovehiculo;
	
	@Column(name="Precio", nullable=false)
	private double Precio;

	public Tarifario() {
		super();
	}

	public Tarifario(Servicio servicio, TipoVehiculo tipovehiculo, double precio) {
		super();
		idTarifario = servicio.getIdServicio() + "_" + tipovehiculo.getIdTipoVehiculo();
		this.servicio = servicio;
		this.tipovehiculo = tipovehiculo;
		Precio = precio;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public TipoVehiculo getTipovehiculo() {
		return tipovehiculo;
	}

	public void setTipovehiculo(TipoVehiculo tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String getIdTarifario() {
		return idTarifario;
	}

	public void setIdTarifario(String idTarifario) {
		this.idTarifario = idTarifario;
	}
}