package pe.edu.upc.dao;

import pe.edu.upc.entity.Empresa;

public interface IEmpresaDao {
	long Insertar(Empresa emp);
	long Modificar (Empresa emp);
}
