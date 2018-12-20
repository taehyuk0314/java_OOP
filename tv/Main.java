package tv;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		TVBean bean = null;
	
	while(true) {
		switch (JOptionPane.showInputDialog("0.종료\n"
				+ "1.TV구매\n"
				+ "2.TV정보보기\n")){
		case "0":
			JOptionPane.showMessageDialog(null,"종료됩니다");
			return;
		case"1":
			//브랜드 
			//티비 색상
			//가격
			bean = new TVBean();
			String brand = JOptionPane.showInputDialog("브랜드는?");
			String color = JOptionPane.showInputDialog("색상은?");
			String price = JOptionPane.showInputDialog("가격은?");
			bean.setbrand(brand);
			bean.setcolor(color);
			bean.setprice(Integer.parseInt(price));
			String toString = bean.toString(bean.getbrand(),
					bean.getcolor(),
					bean.getprice());
			JOptionPane.showMessageDialog(null,toString);
			break;
		case"2":
			//구입한 TV스펙
			
}
}
}
}