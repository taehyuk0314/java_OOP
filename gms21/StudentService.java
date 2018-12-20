package gms21;

import java.util.Random;

public class StudentService {
	public String hakbun() {
		String hakbun="";
		Random random = new Random();
			hakbun +=random.nextInt(9999)+1;
		return hakbun;
	}
	public String info(String hakbun,String name,String ssn,String pass) {
		return String.format("학번은%s\n"
				+ "이름:%s\n"
				+ "주민번호:%s\n"
				+ "비밀번호:%s\n",hakbun,name,ssn,pass);
	}
}
