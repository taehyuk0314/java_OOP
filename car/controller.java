package car;
import javax.swing.JOptionPane;

import card.CardService;
import card.CardBean;

public class controller {
	public static void main(String[] args) {
		Carbean carbean = null;
		Carservice carservice = new CarServiceImpl();
	while(true) {
		switch (JOptionPane.showInputDialog("0.종료\n"
				+ "1.차스펙\n"
				+ "2.")) {
		case "0":
			JOptionPane.showMessageDialog(null,"종료됩니다");
			return;
		case"1":
			carbean = carservice.info(
					JOptionPane.showInputDialog("차색깔"),
					JOptionPane.showInputDialog("기어"),
					Integer.parseInt(JOptionPane.showInputDialog("문 갯수")));			
			break;
		case"2":
			String info = carbean.toString(carbean.getcolor(),carbean.getgearType(),carbean.getdoor());
			JOptionPane.showMessageDialog(null, info);
			//구입한 TV스펙
}
}
}
}