package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITarifarioDao;
import pe.edu.upc.entity.Tarifario;

public class TarifarioDaoImpl implements ITarifarioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public String Insertar(Tarifario tar) {
		em.persist(em);
		return tar.getIdTarifario();
	}

	@Transactional
	@Override
	public String Modificar(Tarifario tar) {
		em.merge(em);
		return tar.getIdTarifario();
	}

	@Transactional
	@Override
	public void Eliminar(int idServicio, int idTipoVehiculo) {
		Tarifario tarifario = new Tarifario();
		String str = idServicio + "_" + idTipoVehiculo;
		tarifario = em.getReference(Tarifario.class, str);
		em.remove(tarifario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Tarifario> ListarPorServicio(int idServicio) {
		List<Tarifario> lst = new ArrayList<Tarifario>();
		Query q = em.createQuery("select t from Tarifarios t where t.idServicio=?1");
		q.setParameter(1, idServicio);
		lst=(List<Tarifario>)q.getResultList();
		return lst;
	}
}
