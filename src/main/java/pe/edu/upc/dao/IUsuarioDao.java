package pe.edu.upc.dao;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioDao {
	long Insertar(Usuario usr) ;
	long Modificar (Usuario usr) ;
	String ObtenerClave(String correo) ;
}
