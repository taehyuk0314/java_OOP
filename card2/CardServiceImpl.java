package card2;

public class CardServiceImpl implements CardService{

	@Override
	public Cardbean bet(String card, int member) {
		Cardbean cardbean = new Cardbean();
		cardbean.setCard(card);
		cardbean.setMember(member);
		return cardbean;
	}
	
}
