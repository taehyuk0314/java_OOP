package gms1;

public class Student {
	String hakbun,name,ssn,pass;
	Student(String hakbun,String name,String ssn,String pass){
		this.hakbun = hakbun;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public String info() {
		return String.format("학번:%s\n"
				+ "이름:%s\n"
				+ "주민번호:%s\n"
				+ "비밀번호:%s\n",hakbun,name,ssn,pass);
	}
}
