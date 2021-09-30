package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEmpresaDao;
import pe.edu.upc.entity.Empresa;

public class EmpresaDaoImpl implements IEmpresaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public long Insertar(Empresa emp){
		em.persist(emp);
		return emp.getRUC();
	}

	@Transactional
	@Override
	public long Modificar(Empresa emp){
		em.merge(emp);
		return emp.getRUC();
	}
	
	

}
