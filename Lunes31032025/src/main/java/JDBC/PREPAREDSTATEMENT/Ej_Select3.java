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



public class Ej_Select3 {

public static void main(String[] args) {


    List<Departamento> result = new ArrayList<Departamento>();

    String SQL_SELECT = "SELECT * FROM DEPT";

   		
   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott", "root", "RAYORAYO#1a");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {

            long id = resultSet.getLong("DEPTNO");
            String nombre = resultSet.getString("DNAME");
            String ciudad = resultSet.getString("LOC");
            

            Departamento obj = new Departamento((int)id,nombre,ciudad);

            result.add(obj);

        }
        for (Departamento item : result) System.out.println(item);
              
        
    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
}
