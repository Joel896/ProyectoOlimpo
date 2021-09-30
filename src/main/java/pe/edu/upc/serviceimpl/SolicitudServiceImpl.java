package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISolicitudDao;
import pe.edu.upc.entity.Solicitud;
import pe.edu.upc.service.ISolicitudService;

@Named
@RequestScoped
public class SolicitudServiceImpl implements ISolicitudService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ISolicitudDao mD;
	
	@Override
	public int Insertar(Solicitud sol) {
		return mD.Insertar(sol);
	}

	@Override
	public int Modificar(Solicitud sol) {
		return mD.Modificar(sol);
	}

	@Override
	public void Eliminar(int idSolicitud) {
		mD.Eliminar(idSolicitud);
	}

	@Override
	public List<Solicitud> ListarPorUsuario(int DNI) {
		return mD.ListarPorUsuario(DNI);
	}

	@Override
	public List<Solicitud> ListarPorSucursal(int idSucursal) {
		return mD.ListarPorSucursal(idSucursal);
	}	
}
