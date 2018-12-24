package car1;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		Carbean carbean = null;
		CarService carService = new CarServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료 1.차 스펙 2. 할인가")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case"1":
				carbean = carService.main(JOptionPane.showInputDialog("차브랜드 입력"), 
						JOptionPane.showInputDialog("색입력"),
						Integer.parseInt(JOptionPane.showInputDialog("가격")));
				JOptionPane.showMessageDialog(null, carbean.toString());
				break;
			case"2":
				carbean  = carService.main1();
				JOptionPane.showMessageDialog(null,carbean.toString() );
				break;
			}
		}
	}
}
