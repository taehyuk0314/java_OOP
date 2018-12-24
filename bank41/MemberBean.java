package bank41;

public class MemberBean {
	private String name,id,pass,ssn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return String.format("이름: %s\n"
				+ "아이디:%s\n"
				+ "비밀번호:%s\n"
				+ "주민등록번호:%s\n", name,id,ssn,pass);
	}
}
