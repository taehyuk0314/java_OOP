package gms21;

public class Studentbean {
	private String hakbun,name,ssn,pass;
	
	
	public void sethakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String gethakbun() {
		return hakbun;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public void setssn(String ssn) {
		this.ssn = ssn;
	}
	public String getssn() {
		return ssn;
	}
	
	public void setpass(String pass) {
		this.pass = pass;
	}
	public String getpass() {
		return pass;
	}
	public String toString() {
		return String.format("학번: %s\n"
				+ "이름%s\n"
				+ "주민번호%s\n"
				+ "비밀번호%s\n",hakbun,name,ssn,pass);
	}
}
