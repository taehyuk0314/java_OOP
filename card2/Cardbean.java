package card2;

public class Cardbean {
	private String card;
	private int member;
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return String.format("카드는 :%s\n"
				+ "번호는:%s\n", card,member);
	}
}
