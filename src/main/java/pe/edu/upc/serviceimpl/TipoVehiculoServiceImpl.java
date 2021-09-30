package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoVehiculoDao;
import pe.edu.upc.entity.TipoVehiculo;
import pe.edu.upc.service.ITipoVehiculoService;

@Named 
@RequestScoped
public class TipoVehiculoServiceImpl implements ITipoVehiculoService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ITipoVehiculoDao mD;
	
	@Override
	public List<TipoVehiculo> Listar()  {
		return mD.Listar();
	}
	

}
