package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFavoritoDao;
import pe.edu.upc.entity.Favorito;
import pe.edu.upc.service.IFavoritoService;

@Named 
@RequestScoped
public class FavoritoServiceImpl implements IFavoritoService, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IFavoritoDao mD;
	
	@Override
	public int Insertar(Favorito fav)  {
		return mD.Insertar(fav);
	}

	@Override
	public int Modificar(Favorito fav)  {
		return mD.Modificar(fav);
	}

	@Override
	public void Eliminar(int DNI, int idServicio) {
		mD.Eliminar(DNI, idServicio);
	}

	@Override
	public List<Favorito> ListarPorUsuario(int DNI)  {
		// TODO Auto-generated method stub
		return null;
	}
	

}
