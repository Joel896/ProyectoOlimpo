package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Solicitud;

public interface ISolicitudDao {
	int Insertar(Solicitud sol) ;
	int Modificar(Solicitud sol) ;
	void Eliminar(int idSolicitud);
	List<Solicitud> ListarPorUsuario(int DNI) ;
	List<Solicitud> ListarPorSucursal(int idSucursal) ;
}
