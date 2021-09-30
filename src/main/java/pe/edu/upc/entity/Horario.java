package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="Horarios")
public class Horario implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String idHorario;
	
	@ManyToOne
	@JoinColumn(name="idSucursal")
	private Sucursal sucursal;

	@ManyToOne
	@JoinColumn (name="Dia")
	private Dia dia;
	
	@Column(name="HoraInicio",nullable=true)
	private int HoraInicio;
	
	@Column(name="HoraFin",nullable=true)
	private int HoraFin;

	public Horario() {
		super();
	}

	public Horario(Sucursal sucursal, Dia dia, int horaInicio, int horaFin) {
		super();
		idHorario = sucursal.getIdSucursal() + dia.getDia();
		this.sucursal = sucursal;
		this.dia = dia;
		HoraInicio = horaInicio;
		HoraFin = horaFin;
	}

	public String getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(String idHorario) {
		this.idHorario = idHorario;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public int getHoraInicio() {
		return HoraInicio;
	}

	public void setHoraInicio(int horaInicio) {
		HoraInicio = horaInicio;
	}

	public int getHoraFin() {
		return HoraFin;
	}

	public void setHoraFin(int horaFin) {
		HoraFin = horaFin;
	}
	
}
