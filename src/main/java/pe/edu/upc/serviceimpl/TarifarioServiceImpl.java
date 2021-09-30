package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITarifarioDao;
import pe.edu.upc.entity.Tarifario;
import pe.edu.upc.service.ITarifarioService;

@Named 
@RequestScoped
public class TarifarioServiceImpl implements ITarifarioService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ITarifarioDao mD;
	
	@Override
	public String Insertar(Tarifario tar)  {
		return mD.Insertar(tar);
	}

	@Override
	public String Modificar(Tarifario tar)  {
		return mD.Modificar(tar);
	}

	@Override
	public void Eliminar(int idServicio, int idTipoVehiculo)  {
		mD.Eliminar(idServicio, idTipoVehiculo);
	}

	@Override
	public List<Tarifario> ListarPorServicio(int idServicio)  {
		return mD.ListarPorServicio(idServicio);
	}
	
	

}
