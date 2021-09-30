package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.dao.ITipoServicioDao;
import pe.edu.upc.entity.TipoServicio;

public class TipoServicioDaoImpl implements ITipoServicioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoServicio> Listar() {
		List<TipoServicio> lst = new ArrayList<TipoServicio>();
		Query q = em.createQuery("select t from TiposServicio t");
		lst = (List<TipoServicio>)q.getResultList();
		return lst;
	}
}
