package bank2;

public class Member {
	String id,name,pass,ssn;
	Member(String id,String name,String pass, String ssn){
		this.id=id;
		this.name=name;
		this.pass =pass;
		this.ssn = ssn;
	}
	public String inif() {
		return String.format("[신상정보]"
				+ "1.아이디 : %s\n"
				+ "2.이름 : %s\n"
				+ "3.비밀번호 : %s\n"
				+ "4.주민등록번호 : %s",id,name,pass,ssn);
	}
}