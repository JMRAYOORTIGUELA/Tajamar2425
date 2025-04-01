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

import JDBC.CLASES.Empleado;



public class Ej_Select {

public static void main(String[] args) {


    List<Empleado> result = new ArrayList<Empleado>();

    String SQL_SELECT = "Select * from EMP where hiredate is not null";

   		
   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott", "root", "RAYORAYO#1a");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {

            long id = resultSet.getLong("EMPNO");
            String name = resultSet.getString("ENAME");
            BigDecimal salario = resultSet.getBigDecimal("SAL");
            Timestamp fecha = resultSet.getTimestamp("HIREDATE");

            Empleado obj = new Empleado(id,name,salario,fecha.toLocalDateTime());

            result.add(obj);

        }
        for (Empleado item : result) System.out.println(item);
              
        
    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
}
