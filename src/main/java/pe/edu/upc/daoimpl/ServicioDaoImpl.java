package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entity.Servicio;

public class ServicioDaoImpl implements IServicioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public int Insertar(Servicio ser)  {
		em.persist(ser);
		return ser.getIdServicio();
	}

	@Transactional
	@Override
	public int Modificar(Servicio ser)  {
		em.merge(ser);
		return ser.getIdServicio();
	}
	
	@Transactional
	@Override
	public void Eliminar(int idServicio) {
		Servicio servicio = new Servicio();
		servicio = em.getReference(Servicio.class, idServicio);
		em.remove(servicio);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> Listar()  {
		List<Servicio> lst = new ArrayList<Servicio>();
		Query q = em.createQuery("select s from Servicios s");
		lst = (List<Servicio>) q.getResultList();
		return lst;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> ListarPorNombre(String nombre)  {
		List<Servicio> lst = new ArrayList<Servicio>();
		Query q = em.createQuery("select s from Servicios s where s.Servicio like ?1");
		q.setParameter(1,"%"+nombre+"%");
		lst = (List<Servicio>) q.getResultList();
		return lst;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> ListarPorSucursal(int idSucursal)  {
		List<Servicio> lst = new ArrayList<Servicio>();
		Query q = em.createQuery("select s from Servicios s where s.idSucursal=?1");
		q.setParameter(1,idSucursal);
		lst = (List<Servicio>) q.getResultList();
		return lst;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> ListarPorDistrito(int idDistrito)  {
		List<Servicio> lst = new ArrayList<Servicio>();
		Query q = em.createQuery("select s from Servicios s join Sucursales c on s.idSucursal=c.id where c.idDistrito=?1");
		q.setParameter(1, idDistrito);
		lst = (List<Servicio>) q.getResultList();
		return lst;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> ListarPorTipo(int idTipoServicio)  {
		List<Servicio> lst = new ArrayList<Servicio>();
		Query q = em.createQuery("select s from Servicios s where s.idTipoServicio=?1");
		q.setParameter(1,idTipoServicio);
		lst = (List<Servicio>) q.getResultList();
		return lst;
	}
}
