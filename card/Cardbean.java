package card;

public class CardBean {
	private String kind; //카드종류 스페이드,다이아,하트,클로버
	private int number;
	public void setkind(String kind) {
		this.kind = kind;
	}
	public String getkind() {
		return kind;
	}
	public void setnumber(int number) {
		this.number =number;
	}
	public int getnumber() {
		return number;
	}
	public String toString(String kind,int number) {
		return String.format("모양은: %s\n"
				+ "숫자는:%d\n", kind,number);
	}
}
