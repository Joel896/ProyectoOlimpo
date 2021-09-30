package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Calificacion;

public interface ICalificacionDao {
	String Insertar(Calificacion cal) ;
	String Modificar (Calificacion cal) ;
	List<Calificacion> Listar() ;
	List<Calificacion> ListarPorServicio(int idServicio) ;
	List<Calificacion> ListarPorSucursal(long RUC) ;
}
