package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entity.Servicio;
import pe.edu.upc.service.IServicioService;

@Named 
@RequestScoped
public class ServicioServiceImpl implements IServicioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private IServicioDao mD;

	@Override
	public int Insertar(Servicio ser)  {
		return mD.Insertar(ser);
	}

	@Override
	public int Modificar(Servicio ser)  {
		return mD.Modificar(ser);
	}
	
	@Override
	public void Eliminar(int idServicio) {
		mD.Eliminar(idServicio);
	}

	@Override
	public List<Servicio> Listar()  {
		return mD.Listar();
	}

	@Override
	public List<Servicio> ListarPorNombre(String nombre)  {
		return mD.ListarPorNombre(nombre);
	}

	@Override
	public List<Servicio> ListarPorSucursal(int idSucursal)  {
		return mD.ListarPorSucursal(idSucursal);
	}

	@Override
	public List<Servicio> ListarPorDistrito(int idDistrito)  {
		return mD.ListarPorDistrito(idDistrito);
	}

	@Override
	public List<Servicio> ListarPorTipo(int idTipoServicio)  {
		return mD.ListarPorTipo(idTipoServicio);
	}
}
