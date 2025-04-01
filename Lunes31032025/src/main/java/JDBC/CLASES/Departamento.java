package JDBC.CLASES;

public class Departamento {
private int DEPTNO;
private String DNAME;
private String LOC;

public Departamento(int dEPTNO, String dNAME, String lOC) {
	super();
	DEPTNO = dEPTNO;
	DNAME = dNAME;
	LOC = lOC;
}
public int getDEPTNO() {
	return DEPTNO;
}
public void setDEPTNO(int dEPTNO) {
	DEPTNO = dEPTNO;
}
public String getDNAME() {
	return DNAME;
}
public void setDNAME(String dNAME) {
	DNAME = dNAME;
}
public String getLOC() {
	return LOC;
}
public void setLOC(String lOC) {
	LOC = lOC;
}
@Override
public String toString() {
	return "Departamento [DEPTNO=" + DEPTNO + ", DNAME=" + DNAME + ", LOC=" + LOC + "]";
}

}
