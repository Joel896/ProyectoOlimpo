package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.dao.IEstadoSolicitudDao;
import pe.edu.upc.entity.EstadoSolicitud;

public class EstadoSolicitudDaoImpl implements IEstadoSolicitudDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<EstadoSolicitud> Listar() {
		List<EstadoSolicitud> lst = new ArrayList<EstadoSolicitud>();
		Query q = em.createQuery("select e from EstadosSolicitud e");
		lst = (List<EstadoSolicitud>)q.getResultList();
		return lst;
	}
	
}
