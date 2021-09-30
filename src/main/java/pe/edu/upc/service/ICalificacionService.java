package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Calificacion;

public interface ICalificacionService {
	String Insertar(Calificacion cal) ;
	String Modificar (Calificacion cal) ;
	List<Calificacion> Listar() ;
	List<Calificacion> ListarPorServicio(int idServicio) ;
	List<Calificacion> ListarPorSucursal(long RUC) ;
}
