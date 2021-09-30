package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Favorito;

public interface IFavoritoService {
	int Insertar(Favorito fav) ;
	int Modificar (Favorito fav) ;
	void Eliminar (int DNI, int idServicio);
	List<Favorito> ListarPorUsuario(int DNI) ;
}
