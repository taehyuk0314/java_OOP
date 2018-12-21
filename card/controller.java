package card;

import javax.swing.JOptionPane;

public class controller {
		public static void main(String[] args) {
			CardBean cardbean = null;
			CardService cardService = new CardServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.카드 \n"
					+ "2.카드보기\n")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료됩니다");
				return;
			case"1":
				//카드종료
				//카드번호
				cardbean = cardService.info(JOptionPane.showInputDialog("카드 종류를 알려주세요"),
						Integer.parseInt(JOptionPane.showInputDialog("카드 번호를 입력하세요")));
				
				break;
			case"2":
				String info = cardbean.toString(cardbean.getkind(),cardbean.getnumber());
				JOptionPane.showMessageDialog(null, info);
				//제출한 카드의 스펙
				break;
			}
		}
		}
}