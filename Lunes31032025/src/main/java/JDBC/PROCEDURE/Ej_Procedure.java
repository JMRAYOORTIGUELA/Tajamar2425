package JDBC.PROCEDURE;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;


public class Ej_Procedure {
    public static Connection conn=null;
    public static void insertar_empleado(String nombre,double salario ) throws SQLException {
    	String sentencia= " create procedure insertar_empleado(nombre VARCHAR(25),salario double) "
    			+ " BEGIN"
    			+ " insert into EMPLEADOS(NOMBRE,SALARIO) VALUES(nombre,salario);"
    			+ " commit;"
    			+ " end ";
    		
    	String ejecutarSentencia="{ CALL insertar_empleado(?,?) }";
    	
    	try (Statement statement=conn.createStatement();){
    		try {
    			statement.execute(sentencia);
    		}catch(Exception e) {
    			System.out.println(e.getMessage());
    		}
    		
    		CallableStatement llamar=conn.prepareCall(ejecutarSentencia);
    		llamar.setString(1,nombre);
    		llamar.setDouble(2,salario);
    		llamar.executeUpdate();
    		
    	} catch (SQLException e) {
	        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    	} 
    public static void select_where_salario(double salario) throws SQLException {
    	String sentencia= " create procedure empleados_salario(IN vsalario double)"
    			+ " BEGIN"
    			+ " SELECT * FROM EMPLEADOS WHERE SALARIO<=vSALARIO;"
    			+ " end ";
    		
    	String ejecutarSentencia="{ CALL empleados_salario(?) }";
    	
    	try (Statement statement=conn.createStatement();){
    		try {
    			statement.execute(sentencia);
    		}catch(Exception e) {
    			System.out.println(e.getMessage());
    		}
    		
    		CallableStatement llamar=conn.prepareCall(ejecutarSentencia);
    		llamar.setDouble(1, salario);
    		
    		ResultSet rs=llamar.executeQuery();
    		
    		while(rs.next()) {
    			System.out.printf("%5d %-20S %10.2f %s\n",
    					rs.getInt("ID"),
    					rs.getString("NOMBRE"),
    					rs.getBigDecimal("SALARIO"),
    					new SimpleDateFormat("DD-MM-YYYY").format(rs.getDate("FECHA")));
    		}
    	} catch (SQLException e) {
	        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    	} 
    public static void MEDIAPORDEPARTAMENTO() throws SQLException {
    	String sentencia= " create procedure mediaspordepartamento()"
    			+ " BEGIN"
    			+ " SELECT A.DEPTNO,MIN(A.DNAME) DEPARTAMENTO,"
    			+ " COUNT(B.EMPNO) NE,IFNULL(AVG(SAL),0) MEDIA"
    			+ " FROM dept A LEFT JOIN emp B ON A.DEPTNO=B.DEPTNO"
    			+ " GROUP BY A.DEPTNO ORDER BY MEDIA DESC;"
    			+ " end ";
    		
    	String ejecutarSentencia="{ CALL mediaspordepartamento() }";
    	
    	try (Statement statement=conn.createStatement();){
    		try {
    			statement.execute(sentencia);
    		}catch(Exception e) {
    			System.out.println(e.getMessage());
    		}
    		
    		CallableStatement llamar=conn.prepareCall(ejecutarSentencia);
    		
    		ResultSet rs=llamar.executeQuery();
    		
    		while(rs.next()) {
    			System.out.printf("%5d %-20S %5d %10.2f \n",
    					rs.getInt("DEPTNO"),
    					rs.getString("DEPARTAMENTO"),
    					rs.getInt("NE"),
    					rs.getDouble("MEDIA"));
    		}
    	} catch (SQLException e) {
	        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
    	} 

    
	public static void main(String[] args) {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3309/bd_scott", "root", "root");
			//select_where_salario(1000);
			//insertar_empleado("jose andres",8000);
			MEDIAPORDEPARTAMENTO();
	} catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
	}

}
