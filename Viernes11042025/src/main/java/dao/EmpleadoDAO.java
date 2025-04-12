package dao;

import java.util.List;

import model.Dept;
import model.Emp;

public interface EmpleadoDAO {

public void AñadirEmpleado( Emp emp );
	
public void BorrarEmpleado( int id );
	
public void ActualizarEmpleado(Emp emp ,int id);
	
public List<Emp> getAllEmpleados();

public List<String> getAllJob();
	
public Emp getEmpleadoById( int id );

public int idNuevo();

public List<Dept> getAllDepartamentos();

}
