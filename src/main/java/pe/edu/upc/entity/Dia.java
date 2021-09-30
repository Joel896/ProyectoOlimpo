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
@Table(name="Dias")
public class Dia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDia;
	
	@Column(name="Dia", nullable=false, length=10)
	private String Dia;
	
	@OneToMany(mappedBy="sucursal", cascade = CascadeType.ALL)
	private Set<Horario> Horarios;

	public Dia() {
		super();
	}

	public Dia(int idDia, String dia, Set<Horario> horarios) {
		super();
		this.idDia = idDia;
		Dia = dia;
		Horarios = horarios;
	}

	public int getIdDia() {
		return idDia;
	}

	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}

	public String getDia() {
		return Dia;
	}

	public void setDia(String dia) {
		Dia = dia;
	}

	public Set<Horario> getHorarios() {
		return Horarios;
	}

	public void setHorarios(Set<Horario> horarios) {
		Horarios = horarios;
	}
}
