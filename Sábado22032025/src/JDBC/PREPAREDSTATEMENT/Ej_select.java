package JDBC.PREPAREDSTATEMENT;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import JDBC.CLASES.*;

public class Ej_select {

	public static void main(String[] args) throws SQLException {
		String SQL_SELECT="SELECT * FROM EMP ORDER BY SAL DESC";
		
		ArrayList<EMPLEADO> lista=new ArrayList<EMPLEADO>();
		
		
		try( Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott","root","root");
			PreparedStatement sentencia=conn.prepareStatement(SQL_SELECT);	
				){
			
			ResultSet resultados=sentencia.executeQuery();
			
			while(resultados.next()) {
				 long id=resultados.getLong("EMPNO");
				 String nombre=resultados.getString("ENAME");
				 BigDecimal salario=resultados.getBigDecimal("SAL");
				 Timestamp fecha=resultados.getTimestamp("HIREDATE");
				 
				 lista.add(new EMPLEADO(id,nombre,salario,fecha.toLocalDateTime()));
				 
			}
            lista.forEach(System.out::println);
            
            //for (EMPLEADO item : lista) System.out.println(item);
		
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
