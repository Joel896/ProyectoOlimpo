package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDiaDao;
import pe.edu.upc.entity.Dia;
import pe.edu.upc.service.IDiaService;

@Named
@RequestScoped 
public class DiaServiceImpl implements IDiaService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDiaDao mD;
	
	@Override
	public List<Dia> Listar()  {
		return mD.Listar(); 
	}
}
