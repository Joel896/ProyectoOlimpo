package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.dao.IDiaDao;
import pe.edu.upc.entity.Dia;

public class DiaDaoImpl implements IDiaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Dia> Listar()  {
		List<Dia>lst=new ArrayList<Dia>();
		Query q = em.createQuery("select d from Dias d");
		lst=(List<Dia>)q.getResultList();
		return lst;
	}

}
