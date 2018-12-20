package card;

public class Cardbean {
	private String kind,number; //카드종류 스페이드,다이아,하트,클로버
	
	public void setkind(String kind) {
		this.kind = kind;
	}
	public String getkind() {
		return kind;
	}
	public void setnumber(String number) {
		this.number =number;
	}
	public String getnumber() {
		return number;
	}
	public String toString(String kind,String number) {
		return String.format("모양은: %s\n"
				+ "숫자는:%s\n", kind,number);
	}
}
