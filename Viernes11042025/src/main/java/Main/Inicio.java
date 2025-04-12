package Main;

import java.sql.Date;
import java.time.LocalDate;

import dao.DepartamentoDAOImplementacion;
import dao.EmpleadoDAOImplementacion;
import model.Dept;
import model.Emp;

public class Inicio {
public static void main(String[] args) {
	EmpleadoDAOImplementacion empleado=new EmpleadoDAOImplementacion();

	Emp jose=new Emp(8888,100,"jose luis",new Date(10, 5, 2020),
			"MANAGER",7902,5000,10);
	
	
	empleado.AñadirEmpleado(jose);
	for( Emp item: empleado.getAllEmpleados())System.out.println(item);
	
	DepartamentoDAOImplementacion departamento=new DepartamentoDAOImplementacion();
    departamento.AñadirDepartamento(new Dept(60,"IA","MALAGA"));
}
}
