package card;

public class CardService {
	public String info(String kind,String number) {
		return String.format("모양은: %s\n"
				+ "숫자는:%s\n", kind,number);
	}
}
