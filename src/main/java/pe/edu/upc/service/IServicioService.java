package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Servicio;

public interface IServicioService {
	int Insertar(Servicio ser) ;
	int Modificar (Servicio ser) ;
	void Eliminar (int idServicio);
	List<Servicio> Listar() ;
	List<Servicio> ListarPorNombre(String nombre) ;
	List<Servicio> ListarPorSucursal(int idSucursal);
	List<Servicio> ListarPorDistrito(int idDistrito);
	List<Servicio> ListarPorTipo(int idTipoServicio) ;
}
