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



public class Ej_Insert2 {

public static void main(String[] args) {

   ArrayList<Departamento> lista=new ArrayList<Departamento>();

   lista.add(new Departamento(160,"A","A"));
   lista.add(new Departamento(170,"B","B"));
   lista.add(new Departamento(80,"C","C"));
   lista.add(new Departamento(190,"D","D"));
   lista.add(new Departamento(200,"E","E"));

    String SQL_INSERT = "INSERT INTO DEPT(DEPTNO,DNAME,LOC) VALUES( ?, ? , ?)";

   		
   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott", "root", "RAYORAYO#1a");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {


	   for (Departamento item : lista) {
		   preparedStatement.setInt(1,item.getDEPTNO());
		    preparedStatement.setString(2,item.getDNAME());
		    preparedStatement.setString(3,item.getLOC());
		    
		    try {
			    int row=preparedStatement.executeUpdate();
			    System.out.println(row+" filas insertadas");
		    }catch(SQLException e) {
		    	System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		    }
	    }
	   
        
    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
}
