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



public class Ej_Update {

public static void main(String[] args) {

    String SQL_UPDATE = "UPDATE EMP SET SAL=SAL+? WHERE DEPTNO=?";

   		
   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott", "root", "RAYORAYO#1a");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE)) {

	    preparedStatement.setDouble(1, 200);
	    preparedStatement.setInt(2, 10);

	   
	    int row=preparedStatement.executeUpdate();
	    System.out.println(row+" filas actualizadas");
	   
              
        
    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
}
