package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Dept;
import util.DBUtil;

public class DepartamentoDAOImplementacion implements DepartamentoDAO {
	private Connection conn;

	public DepartamentoDAOImplementacion() {
		conn = DBUtil.getConnection();
	}
	public void AñadirDepartamento(Dept dept) {
		try {
			String query = "insert into dept values(?,?,?)";
			PreparedStatement s = conn.prepareStatement( query );
			s.setInt( 1, dept.getDeptno() );
			s.setString( 2, dept.getDname());
			s.setString( 3, dept.getLoc() );
			
			s.executeUpdate();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void BorrarDepartamento(int id) {
		try {
			String query = "delete from dept where DEPTNO=?";
			PreparedStatement s = conn.prepareStatement(query);
			s.setInt(1, id);
			s.executeUpdate();
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void ActualizarDepartamento(Dept dept, int id) {
		try {
			String query = "update dept set DEPTNO=?,DNAME=?,LOC=? where DEPTNO=?";
				PreparedStatement s = conn.prepareStatement( query );
				s.setInt( 1, dept.getDeptno() );
				s.setString( 2, dept.getDname());
				s.setString( 3, dept.getLoc() );
				s.setInt( 4, id );
				
				s.executeUpdate();
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

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

	public Dept getDepartamentoById(int id) {
		Dept de = new Dept();
		try {
			String query = "select * from dept where DEPTNO=?";
			PreparedStatement preparedStatement = conn.prepareStatement( query );
			preparedStatement.setInt(1, id);
			ResultSet r = preparedStatement.executeQuery();
			while( r.next() ) {
				de.setDeptno(r.getInt(1));
				de.setDname(r.getString(2));
				de.setLoc(r.getString(3));
			}
			r.close();
			preparedStatement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return de;
	}

	public int idNuevo() {
		int n=0;
		try {
			String query = "select max(DEPTNO)+1 from dept";
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
}
