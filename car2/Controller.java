package car2;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		Carbean carbean = null;
		CarService carService = new CarServiceImpl();
	while(true) {
		switch(JOptionPane.showInputDialog("0.종료\n"
				+ "1.차량입고\n"
				+ "2.차량목록\n"
				+ "3.차량검색\n"
				+ "4.차량판매 ")) {
		case "0":
			JOptionPane.showMessageDialog(null, "종료");
			return;
		case"1" : 
			carbean = carService.add(JOptionPane.showInputDialog("브랜드?"),
					JOptionPane.showInputDialog("컬러?"),
					JOptionPane.showInputDialog("기어타입"),
					Integer.parseInt(JOptionPane.showInputDialog("문갯수")));
			break;
		case"2" : 
			carService.list();
			break;
		case"3" : 
			carService.find();
			break;
		case"4" : 
			carService.sell();
			break;
		}
	}
}
}
