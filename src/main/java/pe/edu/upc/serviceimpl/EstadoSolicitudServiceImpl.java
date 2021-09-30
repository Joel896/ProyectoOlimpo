package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.dao.IEstadoSolicitudDao;
import pe.edu.upc.entity.EstadoSolicitud;
import pe.edu.upc.service.IEstadoSolicitudService;

public class EstadoSolicitudServiceImpl implements IEstadoSolicitudService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	IEstadoSolicitudDao mD;
	
	@Override
	public List<EstadoSolicitud> Listar() {
		return mD.Listar();
	}

}
