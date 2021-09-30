package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISucursalDao;
import pe.edu.upc.entity.Sucursal;
import pe.edu.upc.service.ISucursalService;

@Named 
@RequestScoped
public class SucursalServiceImpl implements ISucursalService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ISucursalDao mD;
	
	@Override
	public int Insertar(Sucursal sur) throws Exception {
		return mD.Insertar(sur);
	}

	@Override
	public int Modificar(Sucursal sur) throws Exception {
		return mD.Modificar(sur);
	}

	@Override
	public List<Sucursal> Listar() throws Exception {
		return mD.Listar();
	}

	@Override
	public List<Sucursal> ListarPorDistrito(String nombre) throws Exception {
		return mD.ListarPorDistrito(nombre);
	}

	@Override
	public List<Sucursal> ListarPorEmpresa(int idSucursal) throws Exception {
		return mD.ListarPorEmpresa(idSucursal);
	}
	

}
