package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Emp implements Serializable {

	private static final long serialVersionUID = 1L;
	private int empno;
	private double comm;
	private String ename;
	private Date hiredate;
	private String job;
	private int mgr;
	private double sal;
	private int deptno;
	public Emp() {
		super();
	}
	
	public Emp(int empno, double comm, String ename,Date hiredate, String job, int mgr, double sal, int deptno) {
		super();
		this.empno = empno;
		this.comm = comm;
		this.ename = ename;
		this.hiredate = hiredate;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", comm=" + comm + ", ename=" + ename + ", hiredate=" + hiredate + ", job=" + job
				+ ", mgr=" + mgr + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	
}