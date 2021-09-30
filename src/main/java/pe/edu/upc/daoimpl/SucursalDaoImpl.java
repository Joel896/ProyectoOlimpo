package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISucursalDao;
import pe.edu.upc.entity.Sucursal;

public class SucursalDaoImpl implements ISucursalDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public int Insertar(Sucursal sur) {
		em.persist(sur);
		return sur.getIdSucursal();
	}

	@Transactional
	@Override
	public int Modificar(Sucursal sur) {
		em.merge(sur);
		return sur.getIdSucursal();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sucursal> Listar() {
		List<Sucursal> lst = new ArrayList<Sucursal>();
		Query q = em.createQuery("select s from Sucursales s");
		lst = (List<Sucursal>) q.getResultList();
		return lst;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sucursal> ListarPorDistrito(String nombre) {
		List<Sucursal> lst = new ArrayList<Sucursal>();
		Query q = em.createQuery("select s from Sucursales s where s.idDistrito=?1");
		q.setParameter(1, nombre);
		lst = (List<Sucursal>) q.getResultList();
		return lst;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sucursal> ListarPorEmpresa(int idSucursal) {
		List<Sucursal> lst = new ArrayList<Sucursal>();
		Query q = em.createQuery("select s from Sucursales s where s.RUCEmpresa=?1");
		q.setParameter(1, idSucursal);
		lst = (List<Sucursal>) q.getResultList();
		return lst;
	}

}
