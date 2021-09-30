package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Sucursal;

public interface ISucursalService {
	int Insertar(Sucursal sur) throws Exception;
	int Modificar (Sucursal sur) throws Exception;
	List<Sucursal> Listar() throws Exception;
	List<Sucursal> ListarPorDistrito(String nombre) throws Exception;
	List<Sucursal> ListarPorEmpresa(int idSucursal)throws Exception;
}
