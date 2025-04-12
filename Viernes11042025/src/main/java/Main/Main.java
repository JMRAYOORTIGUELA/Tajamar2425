package Main;
import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Instant;
import java.util.Scanner;

import dao.DepartamentoDAOImplementacion;
import model.Dept;
import oracle.jdbc.OracleArray;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleTypes;
import util.DBUtil;

public class Main {

		public static void crearProcedimientos() {
	  	 String Procedimiento = "CREATE OR REPLACE PROCEDURE insertar_emp( "
                 + " id IN EMP.EMPNO%TYPE,nombre IN EMP.ENAME%TYPE, salario IN EMP.SAL%TYPE, fecha IN EMP.HIREDATE%TYPE,SALIDA OUT VARCHAR2) AS "
                 + " BEGIN "
                 + "     INSERT INTO EMP( EMPNO, ENAME, SAL, HIREDATE ) VALUES(id,nombre,salario,fecha); "
                 + "     COMMIT; "
                 +"      SALIDA:= 'TRUE';"
                 +" EXCEPTION"
                 +" WHEN OTHERS THEN" 
                 +" SALIDA := 'FALSE';"
                 +" ROLLBACK;"
                 + " END; ";
         DBUtil.crearProcedimiento(Procedimiento);
               Procedimiento="create or replace PROCEDURE leer_empleado_por_nombre( "
        		   +" NOMBRE IN EMP.ENAME%TYPE, XCURSOR OUT SYS_REFCURSOR) AS "
                   +" BEGIN "
                   +" OPEN XCURSOR FOR "
                   +" SELECT * FROM EMP WHERE ENAME LIKE NOMBRE || '%'; "
                +"END; ";
   
         DBUtil.crearProcedimiento(Procedimiento);
               Procedimiento=" CREATE OR REPLACE PROCEDURE leer_emp_por_empno( " + 
               		"   p_empno IN EMP.EMPNO%TYPE," + 
               		"   o_nombre OUT EMP.ENAME%TYPE, " + 
               		"   o_salario OUT EMP.SAL%TYPE, " + 
               		"   o_fecha OUT EMP.HIREDATE%TYPE)AS " + 
               		"   BEGIN " + 
               		"    SELECT ENAME , SAL, HIREDATE INTO o_nombre, o_salario, o_fecha from EMP WHERE EMPNO = p_empno; " + 
               		"   END;";
         DBUtil.crearProcedimiento(Procedimiento);
         Procedimiento=" CREATE OR REPLACE FUNCTION TOTAL_RETRIBUCION(N EMP.DEPTNO%TYPE) RETURN NUMBER IS "
         		+ " SALIDA NUMBER:=0;"
         		+ " BEGIN "
         		+ " SELECT SUM(NVL(SAL+COMM,SAL)) INTO SALIDA FROM EMP WHERE DEPTNO=N; "
         		+ " RETURN SALIDA; "
         		+ " END; ";
         DBUtil.crearProcedimiento(Procedimiento);
	}
		
	public static void leer_empleado_por_nombre() {

		String url="jdbc:oracle:thin:@localhost:15210/XEPDB1";
 		String user="SCOTT";
 		String password="TIGER";
 		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca el nombre del empleado");
		String nombre = input.nextLine();
  			try {
 				Class.forName("oracle.jdbc.driver.OracleDriver");
 				Connection connection=DriverManager.getConnection(url,user,password);

 				//LLamado del procedimiento al estilo pl/sql
 				//String sql1="begin leer_empleado_por_nombre(?,?); end;";
 				String sql="{CALL leer_empleado_por_nombre(?,?)}";
  				CallableStatement callableStatement=connection.prepareCall(sql);

  				//Parametros de entrada
  				callableStatement.setString(1, nombre);
 				callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
  				callableStatement.execute();

 				//Se obtiene el cursor en forma de ResultSe 
				ResultSet rs = (ResultSet)callableStatement.getObject(2);
 				while (rs.next()){
 					System.out.println(rs.getLong("EMPNO"));
 					System.out.println(rs.getString("ENAME"));
 					System.out.println(rs.getString("JOB"));
 				} 				
 				rs.close();
 				callableStatement.close();
 				connection.close();
 			} catch (ClassNotFoundException e) {
 				e.printStackTrace();
 			} catch (SQLException e) {
 				//Imprime el mensaje de la exception lanzada en pl/sql si el valor es diferente de 1
 				e.printStackTrace();
 			}
	}
	public static void insertar_emp() throws ParseException {
			String url="jdbc:oracle:thin:@localhost:15210/XEPDB1";
			String user="SCOTT";
			String password="TIGER";

		    Connection con = null;
			CallableStatement stmt = null;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Nº Empleado (int):");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Nombre : ");
			String nombre = sc.nextLine();
			System.out.println("Salario:");
			double salario = Double.parseDouble(sc.nextLine());
			
			System.out.println("Fecha:");
			DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
			String fechaString = sc.nextLine();
			java.sql.Date fecha = new java.sql.Date(dateFormatter.parse(fechaString).getTime());		
			try{
				
		 		Class.forName("oracle.jdbc.driver.OracleDriver");
		 		con=DriverManager.getConnection(url,user,password);
				stmt = con.prepareCall("{call insertar_emp(?,?,?,?,?)}");
				
				stmt.setInt(1, id);
				stmt.setString(2, nombre);
				stmt.setDouble(3, salario);
				stmt.setDate(4, fecha);
				
				//register the OUT parameter before calling the stored procedure
				stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
			
				stmt.executeUpdate();
				
				//read the OUT parameter now
				String resultado = stmt.getString(5);

				
				System.out.println("Empleado insertado:"+resultado);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					stmt.close();
					con.close();
					//input.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
	public static void leer_emp_por_empno() {
		String url="jdbc:oracle:thin:@localhost:15210/XEPDB1";
		String user="SCOTT";
		String password="TIGER";

		    Connection con = null;
			CallableStatement stmt = null;
			
			//Read User Inputs
			Scanner input = new Scanner(System.in);
			System.out.println("Introduzca nº empleado (int):");
			int id = Integer.parseInt(input.nextLine());
			
			try{
				
		 		Class.forName("oracle.jdbc.driver.OracleDriver");
		 		con=DriverManager.getConnection(url,user,password);
				stmt = con.prepareCall("{call leer_emp_por_empno(?,?,?,?)}");
				stmt.setInt(1, id);
				
				//register the OUT parameter before calling the stored procedure
				stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
				stmt.registerOutParameter(3, java.sql.Types.DOUBLE);
				stmt.registerOutParameter(4, java.sql.Types.DATE);
	
				
				stmt.execute();
				
				//read the OUT parameter now
				String nombre = stmt.getString(2);
				double salario = stmt.getDouble(3);
				LocalDate fecha = stmt.getDate(4).toLocalDate();

				
				if(nombre !=null){
				System.out.printf("Nombre=%s Salario=%.2f Fecha=%tD\n",nombre,salario,fecha);
				}else{
					System.out.println("Empleado no encontrado con ID"+id);
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					stmt.close();
					con.close();
					//input.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
	public static void TOTAL_RETRIBUCION() {
		String url="jdbc:oracle:thin:@localhost:15210/XEPDB1";
		String user="SCOTT";
		String password="TIGER";

		    Connection con = null;
			CallableStatement stmt = null;
			
			//Read User Inputs
			Scanner input = new Scanner(System.in);
			System.out.println("Introduzca nº DEPARTAMENTO (int):");
			int id = Integer.parseInt(input.nextLine());
			
			try{
				
		 		Class.forName("oracle.jdbc.driver.OracleDriver");
		 		con=DriverManager.getConnection(url,user,password);
				stmt = con.prepareCall("{?=call TOTAL_RETRIBUCION(?)}");
				stmt.registerOutParameter(1, java.sql.Types.DOUBLE);
				stmt.setInt(2, id);

				stmt.execute();
				
				//read the OUT parameter now
				double TOTAL = stmt.getDouble(1);

				
				System.out.printf("Nº DEPARTAMENTO=%d TOTAL RETRIBUCIONES=%.2f\n",id,TOTAL);
					
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					stmt.close();
					con.close();
					//input.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}

	public static void main(String[] args) throws ParseException {
		crearProcedimientos();
    	
		leer_empleado_por_nombre();
    	//leer_emp_por_empno();
		//insertar_emp();
		//TOTAL_RETRIBUCION();
    	//crearProcedimientosMySql() ;
	   	
       DepartamentoDAOImplementacion dao=new DepartamentoDAOImplementacion();
        
        for (Dept p:dao.getAllDepartamentos())System.out.println(p);
        
        System.out.println(dao.idNuevo());
        
    	
     /*   EmpleadoDAO daoe=new EmpleadoDAOImplementacion();
        for( Emp p:daoe.getAllEmpleados()) 	System.out.println(p);
        
        for(String p:daoe.getAllJob()) System.out.println(p);
    */
      

    }
}




