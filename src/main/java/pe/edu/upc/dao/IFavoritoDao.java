package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Favorito;

public interface IFavoritoDao {
	int Insertar(Favorito fav) ;
	int Modificar (Favorito fav) ;
	void Eliminar (int DNI, int idServicio);
	List<Favorito> ListarPorUsuario(int DNI) ;
}
