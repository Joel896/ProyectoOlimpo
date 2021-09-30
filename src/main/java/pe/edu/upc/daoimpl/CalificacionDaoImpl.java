package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICalificacionDao;
import pe.edu.upc.entity.Calificacion;

public class CalificacionDaoImpl implements ICalificacionDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;
	
	@Transactional
	@Override
	public String Insertar(Calificacion cal)  {
		em.persist(cal);
		return cal.getId();
	}

	
	@Override
	public String Modificar(Calificacion cal)  {
		em.merge(cal);
		return cal.getId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calificacion> Listar()  {
		List<Calificacion> lst = new ArrayList<Calificacion>();
		Query q = em.createQuery("select c from Calificaciones c");
		lst= (List<Calificacion>) q.getResultList();
		return lst;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calificacion> ListarPorServicio(int idServicio)  {
		List<Calificacion> lst = new ArrayList<>();
		Query q = em.createQuery("select c from Calificaciones c where c.Usuario = ?1");
		q.setParameter(1, idServicio);
		lst= (List<Calificacion>) q.getResultList();
		return lst;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calificacion> ListarPorSucursal(long idSucursal)  {
		List<Calificacion> lst = new ArrayList<>();
		Query q = em.createQuery("select c from Calificaciones c join Servicios s on c.idServicio=s.id where s.idSucursal=?1");
		q.setParameter(1, idSucursal);
		lst= (List<Calificacion>) q.getResultList();
		return lst;
	}
	
	
	
}
