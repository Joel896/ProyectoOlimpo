package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFavoritoDao;
import pe.edu.upc.entity.Favorito;

public class FavoritoDaoImpl implements IFavoritoDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pwPU")
	private EntityManager em;

	@Transactional
	@Override
	public int Insertar(Favorito fav)  {
		
		return 0;
	}

	@Transactional
	@Override
	public int Modificar(Favorito fav)  {
		// TODO Auto-generated method stub
		return 0;
	}

	@Transactional
	@Override
	public void Eliminar(int DNI, int idServicio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Favorito> ListarPorUsuario(int DNI)  {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
