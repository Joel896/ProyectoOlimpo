package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Horario;

public interface IHorarioService {
	String Insertar(Horario hor) ;
	String Modificar (Horario hor) ;
	List<Horario> ListarPorSucursal(int idSucursal) ;
}
