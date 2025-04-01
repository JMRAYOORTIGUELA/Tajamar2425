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



public class Ej_Select2 {

public static void main(String[] args) {


      String SQL_SELECT = "SELECT A.DEPTNO,MIN(A.DNAME) DEPARTAMENTO,COUNT(B.EMPNO) NE, "
    		+ " IFNULL(ROUND(SUM(IFNULL(SAL+COMM,SAL)),2),0) TOTAL"
    		+ " FROM DEPT A LEFT JOIN EMP B ON A.DEPTNO=B.DEPTNO"
    		+ " GROUP BY A.DEPTNO";

   		
   try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_scott", "root", "RAYORAYO#1a");
         PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {

            long id = resultSet.getLong("DEPTNO");
            String nombre = resultSet.getString("DEPARTAMENTO");
            int NE= resultSet.getInt("NE");
            double total=resultSet.getDouble("TOTAL");
            
            System.out.printf("%5d %-20s %5d %.2f\n",id,nombre,NE,total);
            
        }
        
              
        
    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
   }
}
