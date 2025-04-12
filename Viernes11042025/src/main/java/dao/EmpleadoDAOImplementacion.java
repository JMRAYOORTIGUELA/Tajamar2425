package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.ZoneId;

import model.Dept;
import model.Emp;
import util.DBUtil;


public class EmpleadoDAOImplementacion implements EmpleadoDAO {
	
	private Connection conn;

	public EmpleadoDAOImplementacion() {
		conn = DBUtil.getConnection();
	}

	public void AñadirEmpleado(Emp emp) {
		try {
			String query = "insert into emp values (?,?,?,?,?,?,?,?)";
			PreparedStatement s = conn.prepareStatement( query );
			s.setInt( 1, emp.getEmpno() );
			s.setString( 2, emp.getEname() );
			s.setString( 3, emp.getJob());
			s.setInt( 4, emp.getMgr() );
			s.setDate(5, (Date) emp.getHiredate());	
			s.setDouble( 6, emp.getSal() );
			s.setDouble( 7, emp.getComm() );
			s.setInt( 8, emp.getDeptno());
			
			s.executeUpdate();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void BorrarEmpleado(int id) {
		try {
			String query = "delete from emp where EMPNO=?";
			PreparedStatement s = conn.prepareStatement(query);
			s.setInt(1, id);
			s.executeUpdate();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void ActualizarEmpleado(Emp emp,int id) {
		try {
		String query = "update emp set EMPNO=?,ENAME=?,HIREDATE=?, JOB=?, MGR=?,SAL=?,COMM=?,DEPTNO=? where EMPNO=?";
			PreparedStatement s = conn.prepareStatement( query );
			
			s.setInt( 1, emp.getEmpno() );
			s.setString( 2, emp.getEname() );
			s.setDate(3, (Date) emp.getHiredate());			
			s.setString( 4, emp.getJob());
			s.setInt( 5, emp.getMgr() );
			s.setDouble( 6, emp.getSal() );
			s.setDouble( 7, emp.getComm() );
			s.setInt( 8, emp.getDeptno() );
			s.setInt( 9, id );
			
			s.executeUpdate();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Emp> getAllEmpleados() {
		List<Emp> le = new ArrayList<Emp>();
		try {
			Statement statement = conn.createStatement();
			ResultSet r = statement.executeQuery( "select * from emp" );
			while( r.next() ) {
				Emp em = new Emp();
				em.setEmpno(r.getInt(1));
				em.setEname(r.getString(2));
				em.setJob(r.getString(3));
				if (r.getObject("MGR") != null && !r.wasNull()) { 
					em.setMgr(r.getInt("MGR"));  
				}
				em.setHiredate(r.getDate(5));
				em.setSal(r.getDouble(6));
				em.setComm(r.getDouble(7));
				if (r.getObject("DEPTNO") != null && !r.wasNull()) { em.setDeptno(r.getInt("DEPTNO"));  }
				
				le.add(em);
			}
			r.close();
			statement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	
		return le;
	}

	public List<String> getAllJob(){
		List<String> le = new ArrayList<String>();
		try {
			Statement statement = conn.createStatement();
			ResultSet r = statement.executeQuery( "SELECT DISTINCT JOB FROM emp order by 1" );
			while( r.next() ) {
				le.add(r.getString(1));
			}
			r.close();
			statement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	
		return le;
		
		
	}
	
	public Emp getEmpleadoById(int id) {
		
		Emp em = new Emp();
		try {
			String query = "select * from emp where EMPNO=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setInt(1, id);
			ResultSet r = preparedStatement.executeQuery();
			while( r.next() ) {
				em.setEmpno(r.getInt(1));
				em.setEname(r.getString(2));
				em.setHiredate(r.getDate(3));
				em.setJob(r.getString(4));
				em.setMgr(r.getInt(5));
				em.setSal(r.getDouble(6));
				em.setComm(r.getDouble(7));
				em.setDeptno(r.getInt(8));
			}
			r.close();
			preparedStatement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return em;
	}

	public int  idNuevo(){
		int n=0;
		try {
			String query = "select max(EMPNO)+1 from emp";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			ResultSet r = preparedStatement.executeQuery();
			while( r.next() ) {
				n=r.getInt(1);
			}
			r.close();
			preparedStatement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return n;
	}
	public List<Dept> getAllDepartamentos() {

		List<Dept> le = new ArrayList<Dept>();
		try {
			Statement statement = conn.createStatement();
			ResultSet r = statement.executeQuery( "select * from dept" );
			while( r.next() ) {
				Dept de = new Dept();
				de.setDeptno(r.getInt(1));
				de.setDname(r.getString(2));
				de.setLoc(r.getString(3));
				le.add(de);
			}
			r.close();
			statement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	
		return le;
	}	
}
