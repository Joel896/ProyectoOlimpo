package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoServicioDao;
import pe.edu.upc.entity.TipoServicio;
import pe.edu.upc.service.ITipoServicioService;

@Named 
@RequestScoped
public class TipoServicioServiceImpl implements ITipoServicioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ITipoServicioDao mD;
	
	@Override
	public List<TipoServicio> Listar()  {
		return mD.Listar();
	}
	

}
