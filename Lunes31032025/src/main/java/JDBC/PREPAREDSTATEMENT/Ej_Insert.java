package JDBC.PREPAREDSTATEMENT;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import JDBC.CLASES.Departamento;
import JDBC.CLASES.Empleado;



public class Ej_Insert {

public static void main(String[] args) {

    String SQL_INSERT = "INSERT INTO DEPT(DEPTNO,DNAME,LOC) VALUES( ?, ? , ?)";

   		
   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott", "root", "RAYORAYO#1a");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

	    preparedStatement.setInt(1,50);
	    preparedStatement.setString(2,"RRHH");
	    preparedStatement.setString(3,"MADRID");
	   
	    int row=preparedStatement.executeUpdate();
	    System.out.println(row+" filas insertadas");
	   
              
        
    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
}
