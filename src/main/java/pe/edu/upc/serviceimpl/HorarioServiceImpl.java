package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHorarioDao;
import pe.edu.upc.entity.Horario;
import pe.edu.upc.service.IHorarioService;

@Named 
@RequestScoped
public class HorarioServiceImpl implements IHorarioService, Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IHorarioDao mD;


	@Override
	public String Insertar(Horario hor)  {
		return mD.Insertar(hor);
	}

	@Override
	public String Modificar(Horario hor)  {
		return mD.Modificar(hor);
	}

	@Override
	public List<Horario> ListarPorSucursal(int idSucursal)  {
		return mD.ListarPorSucursal(idSucursal);
	} 


}
