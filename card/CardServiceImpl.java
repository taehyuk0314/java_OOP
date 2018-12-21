package card;

public class CardServiceImpl implements CardService {

	@Override
	public CardBean info(String kind, int number) {
		CardBean cardBean = new CardBean();
		cardBean.setkind(kind);
		cardBean.setnumber(number);
		return cardBean;
		
	}

}
