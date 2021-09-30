package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Horario;

public interface IHorarioDao {
	String Insertar(Horario hor) ;
	String Modificar (Horario hor) ;
	List<Horario> ListarPorSucursal(int idSucursal) ;
}
