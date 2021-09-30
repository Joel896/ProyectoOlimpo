package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHorarioDao;
import pe.edu.upc.entity.Horario;

public class HorarioDaoImpl implements IHorarioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public String Insertar(Horario hor)  {
		em.persist(hor);
		return hor.getIdHorario();
	}

	@Transactional
	@Override
	public String Modificar(Horario hor)  {
		em.merge(hor);
		return hor.getIdHorario();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Horario> ListarPorSucursal(int idSucursal)  {
		List<Horario> lst = new ArrayList<Horario>();
		Query q = em.createQuery("select h from Horarios h where h.idSucursal=?1");
		q.setParameter(1, idSucursal);
		lst = (List<Horario>) q.getResultList();
		return lst;
	}
	

}
