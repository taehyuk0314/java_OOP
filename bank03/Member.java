package bank03;

import javax.swing.JOptionPane;

public class Member {
	String id, pass ,name, ssn;
	Member(String id,String pass,String name, String ssn){
		this. id = id;
		this. pass = pass;
		this. name = name;
		this. ssn = ssn;
	}
	public String nam(){
		return String.format("회원정보\n"
				+ "1.아이디:%s \n"
				+ "2.비밀번호:%s \n"
				+ "3.이름:%s \n"
				+ "4.주민번호:%s \n",id,pass,name,ssn);
	}
}
