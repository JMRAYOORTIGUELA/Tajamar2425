package JDBC.PREPAREDSTATEMENT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ej_prepareStatement {
	public static void main(String[] args) {

	    String SQL_BORRAR = "DROP TABLE IF EXISTS EMPLEADOS";
	    String SQL_CREAR=" CREATE TABLE EMPLEADOS ( ID INT AUTO_INCREMENT,NOMBRE VARCHAR(100) NOT NULL , "+
	      " SALARIO DECIMAL(15,2) NOT NULL,FECHA DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY(ID))";

	   		
	   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott", "root", "RAYORAYO#1a");
	         PreparedStatement sentencia1 = conn.prepareStatement(SQL_BORRAR);
			   PreparedStatement sentencia2 = conn.prepareStatement(SQL_CREAR);  
			){

		    sentencia1.execute();
		    sentencia2.execute();
	            
	        
	    } catch (SQLException e) {
	        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	   }
}
