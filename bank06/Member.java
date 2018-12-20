package bank06;

public class Member {
	String id,name,ssn,pass; //멤버변수 = 인스턴스 변수
	Member(String id, String name,String ssn ,String pass){		//파라미터
 		this.id = id;
 		this.name= name;
 		this.ssn = ssn;
 		this.pass = pass;
	}
	/**
	 * 회원 정보 보여주기
	 * */
	public String info() {
		return String.format("아이디:%s\n"
				+ "이름:%s\n"
				+ "주민번호:%s\n"
				+ "비밀번호:%s\n",id,name,ssn,pass);
	};
}
