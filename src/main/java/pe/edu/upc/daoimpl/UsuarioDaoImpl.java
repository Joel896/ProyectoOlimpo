package pe.edu.upc.daoimpl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public long Insertar(Usuario usr) {
		em.persist(usr);
		return usr.getDNI();
	}

	@Transactional
	@Override
	public long Modificar(Usuario usr) {
		em.merge(usr);
		return usr.getDNI();
	}

	@Override
	public String ObtenerClave(String correo) {
		Usuario usuario = new Usuario();
		
		return usuario==null?"":usuario.getContrasenia();
	}


}
