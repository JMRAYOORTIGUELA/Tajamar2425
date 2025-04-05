package JDBC.PREPAREDSTATEMENT;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Ej_BatchUpdate {
	private static final String SQL_CREATE="CREATE TABLE EMPLEADOS "
			+ " ( ID INT AUTO_INCREMENT,"
			+ " NOMBRE VARCHAR(100) NOT NULL,"
			+ " SALARIO DECIMAL(10,2) NOT NULL,"
			+ " FECHA DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,"
			+ " PRIMARY KEY(ID))";
	private static final String SQL_DROP="DROP TABLE IF EXISTS EMPLEADOS";
	private static final String SQL_INSERT="INSERT INTO EMPLEADOS(NOMBRE,SALARIO,FECHA) VALUES(?,?,?)";
	private static final String SQL_UPDATE="UPDATE EMPLEADOS SET SALARIO=? WHERE NOMBRE=?";

	public static void main(String[] args) throws SQLException {
		
	
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3309/bd_scott", "root", "root");
		        PreparedStatement pd=conn.prepareStatement(SQL_DROP);
     		    PreparedStatement pc=conn.prepareStatement(SQL_CREATE);
				PreparedStatement pi=conn.prepareStatement(SQL_INSERT);
				PreparedStatement pu=conn.prepareStatement(SQL_UPDATE);
				){
			     conn.setAutoCommit(false);
			     pd.execute();
			     pc.execute();
			     
			     Savepoint pto=conn.setSavepoint("nuevo");
			     pi.setString(1,"Carlos");
			     pi.setBigDecimal(2, new BigDecimal(10));
			     pi.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			     pi.addBatch();
			     
			     pi.setString(1,"Maria");
			     pi.setBigDecimal(2, new BigDecimal(100));
			     pi.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			     pi.addBatch();
			     
			     pi.setString(1,"Ana");
			     pi.setBigDecimal(2, new BigDecimal(100));
			     pi.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			     pi.addBatch();
			     
			     int[] rows=pi.executeBatch();
			     System.out.println(Arrays.toString(rows));
			     
			     pu.setBigDecimal(1, new BigDecimal(999.99));
			     pu.setString(2,"Ignacio");
			     pi.addBatch();
			     
			     pu.setBigDecimal(1, new BigDecimal(1000.99));
			     pu.setString(2,"Carlos");
			     pi.addBatch();
	
			     rows=pi.executeBatch();
			    System.out.println(Arrays.toString(rows));
			     
			     conn.commit();
			     //conn.rollback();
		} catch (SQLException e) {
	        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	   }
}
