package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.dao.ITipoVehiculoDao;
import pe.edu.upc.entity.TipoVehiculo;

public class TipoVehiculoDaoImpl implements ITipoVehiculoDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TipoVehiculo> Listar() {
		List<TipoVehiculo> lst = new ArrayList<TipoVehiculo>();
		Query q = em.createQuery("select t from TiposVehiculo");
		lst = (List<TipoVehiculo>)q.getResultList();
		return lst;
	}

	
}
