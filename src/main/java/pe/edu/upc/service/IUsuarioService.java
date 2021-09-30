package pe.edu.upc.service;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioService {
	long Insertar(Usuario usr) ;
	long Modificar (Usuario usr) ;
	String ObtenerClave(String correo) ;
}
