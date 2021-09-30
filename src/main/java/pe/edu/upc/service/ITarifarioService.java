package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Tarifario;

public interface ITarifarioService {
	String Insertar(Tarifario tar) ;
	String Modificar (Tarifario tar) ;
	void Eliminar (int idServicio, int idTipoVehiculo) ;
	List<Tarifario> ListarPorServicio(int idServicio) ;
}
