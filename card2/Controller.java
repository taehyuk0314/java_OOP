package card2;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		Cardbean cardbean = null;
		CardService cardService = new CardServiceImpl();
	while(true) {
		switch (JOptionPane.showInputDialog("0.종료 1.카드선택")) {
		case "0":
				JOptionPane.showMessageDialog(null, "종료");
			return;

		case"1":
			String card = JOptionPane.showInputDialog("카드 모양");
			String member = JOptionPane.showInputDialog("카드번호");
			cardbean = cardService.bet(card, Integer.parseInt(member));
			JOptionPane.showMessageDialog(null, cardbean.toString());
			break;
		case"2":
			break;
		}
	}
}
}
