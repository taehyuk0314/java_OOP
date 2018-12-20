package bank11;

public class Member {
	private String id,name,ssn,pass; //멤버변수 = 인스턴스 변수
	public Member(String id, String name,String ssn ,String pass){		//파라미터
 		this.id = id;
 		this.name= name;
 		this.ssn = ssn;
 		this.pass = pass;
	}
	/**
	 * 회원 정보 보여주기
	 * */

	public String getId() { //게터 getter
		return this.id=id;
	}
	
	public void setpass(String pass) { //setter 세터
		this.pass = pass; // write 글을 쓰는 것 인풋
	}
	public String getpass(String pass) {
		return this.pass;
	}
	public String getssn() {
		return this.ssn;
	}
	public String getName() { 
		return this.name; // read 글을 읽는것 아웃풋 읽을순있고 고칠순없음
	}
	
	
	public String toString() {
		return String.format("아이디:%s\n"
				+ "이름:%s\n"
				+ "주민번호:%s\n"
				+ "비밀번호:%s\n",id,name,ssn,pass);
	}
}
