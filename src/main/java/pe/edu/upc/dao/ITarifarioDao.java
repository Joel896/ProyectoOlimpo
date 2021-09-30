package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Tarifario;

public interface ITarifarioDao {
	String Insertar(Tarifario tar) ;
	String Modificar (Tarifario tar) ;
	void Eliminar (int idServicio, int idTipoVehiculo) ;
	List<Tarifario> ListarPorServicio(int idServicio) ;
}
