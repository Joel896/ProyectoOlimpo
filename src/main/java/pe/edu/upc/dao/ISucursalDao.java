package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Sucursal;

public interface ISucursalDao {
	int Insertar(Sucursal sur) ;
	int Modificar (Sucursal sur) ;
	List<Sucursal> Listar() ;
	List<Sucursal> ListarPorDistrito(String nombre) ;
	List<Sucursal> ListarPorEmpresa(int idSucursal);
}
