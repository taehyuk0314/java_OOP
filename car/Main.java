package car;
import javax.swing.JOptionPane;

import card.CardService;
import card.Cardbean;

public class Main {
	public static void main(String[] args) {
		Carbean carbean = null;
		Carservice carservice = new Carservice();
	while(true) {
		switch (JOptionPane.showInputDialog("0.종료\n"
				+ "1.차스펙\n")) {
		case "0":
			JOptionPane.showMessageDialog(null,"종료됩니다");
			return;
		case"1":
			carbean = new Carbean(); 
			String color =JOptionPane.showInputDialog("차색깔"); 
			String gearType = JOptionPane.showInputDialog("기어");
			String door = JOptionPane.showInputDialog("문 갯수");
			carbean.setcolor(color);
			carbean.setgearType(gearType);
			carbean.setdoor(Integer.parseInt(door));
			break;
		case"2":
			String info2 = carservice.info(carbean.getcolor(),carbean.getgearType(), carbean.getdoor());
			JOptionPane.showMessageDialog(null, info2);
			//구입한 TV스펙
}
}
}
}