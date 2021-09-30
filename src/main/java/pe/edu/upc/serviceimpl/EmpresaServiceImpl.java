package pe.edu.upc.serviceimpl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEmpresaDao;
import pe.edu.upc.entity.Empresa;
import pe.edu.upc.service.IEmpresaService;

@Named 
@RequestScoped
public class EmpresaServiceImpl implements IEmpresaService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IEmpresaDao mD;
	
	@Override
	public long Insertar(Empresa emp)  {
		return mD.Insertar(emp);
	}

	@Override
	public long Modificar(Empresa emp)  {
		return mD.Modificar(emp);
	}
	

}
