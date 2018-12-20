package bank07;

public class Member {
	String id,pass,ssn,name;
	Member(String id, String pass,String ssn,String name){
		this.id = id;
		this.pass = pass;
		this.ssn = ssn;
		this.name = name;
	}
	public String info() {
		return String.format("아이디:%s\n "
				+ "비밀번호:%s\n"
				+ "주민번호:%s\n"
				+ "이름:%s\n",id,pass,ssn,name);
	}
}
