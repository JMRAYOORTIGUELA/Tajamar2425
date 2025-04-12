package dao;

import java.util.List;

import model.Dept;


public interface DepartamentoDAO {
	
	public void AñadirDepartamento( Dept dept );
	
	public void BorrarDepartamento( int id );
		
	public void ActualizarDepartamento(Dept dept ,int id);
		
	public List<Dept> getAllDepartamentos();
		
	public Dept getDepartamentoById( int id );

	public int idNuevo();
}
