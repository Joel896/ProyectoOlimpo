package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISolicitudDao;
import pe.edu.upc.entity.Solicitud;

public class SolicitudDaoImpl implements ISolicitudDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public int Insertar(Solicitud sol) {
		em.persist(sol);
		return sol.getIdSolicitud();
	}

	@Transactional
	@Override
	public int Modificar(Solicitud sol) {
		em.merge(sol);
		return sol.getIdSolicitud();
	}

	@Override
	public void Eliminar(int idSolicitud) {
		Solicitud solicitud = new Solicitud();
		solicitud = em.getReference(Solicitud.class, idSolicitud);
		em.remove(solicitud);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Solicitud> ListarPorUsuario(int DNI) {
		List<Solicitud> lista = new ArrayList<Solicitud>();
		Query q = em.createQuery("select s from Solicitudes s where s.DNICliente=?1");
		q.setParameter(1,DNI);
		lista = (List<Solicitud>) q.getResultList();
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Solicitud> ListarPorSucursal(int idSucursal) {
		List<Solicitud> lista = new ArrayList<Solicitud>();
		Query q = em.createQuery("select s from Solicitudes where s.DNICliente=?1");
		q.setParameter(1,idSucursal);
		lista = (List<Solicitud>) q.getResultList();
		return lista;
	}

}
