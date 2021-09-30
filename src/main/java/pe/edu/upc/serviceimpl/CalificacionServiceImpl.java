package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICalificacionDao;
import pe.edu.upc.entity.Calificacion;
import pe.edu.upc.service.ICalificacionService;

@Named
@RequestScoped
public class CalificacionServiceImpl implements ICalificacionService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICalificacionDao mD;
	
	@Override 
	public String Insertar(Calificacion cal){
		return mD.Insertar(cal);
	}
	@Override
	public String Modificar(Calificacion cal){
		return mD.Modificar(cal);
	}
	
	@Override
	public List<Calificacion> Listar() {
		return mD.Listar();
	}
	
	@Override
	public List<Calificacion> ListarPorServicio(int idServicio) {
		return mD.ListarPorServicio(idServicio);
	}
	
	@Override
	public List<Calificacion> ListarPorSucursal(long RUC) {
		return mD.ListarPorSucursal(RUC);
	}
}
