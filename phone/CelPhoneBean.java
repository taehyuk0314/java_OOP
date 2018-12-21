package phone;

public class CelPhoneBean extends PhoneBean {
	private String move;
	
	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	public String toString() {
		
		return String.format("종류는 %s\n"
				+ "제조사는 %s\n"
				+ "이동가능 %s\n"
				+ "통화내용은 %s\n",getKind(),getCompany(),move,getCall());
	}
}
