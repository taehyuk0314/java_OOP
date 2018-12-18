package gms;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[]args) {
		while(true) {
			String menu = JOptionPane.showInputDialog("0.종료\n1.회원관리\n2.계산기\n3.로또\n4.달력");
			switch(menu) {
			case "0" :
				JOptionPane.showMessageDialog(null,"시스템종료");
				return;
			case "1":
		Member m = new Member();
		String name = JOptionPane.showInputDialog("이름입력");
		m.name = name;
		JOptionPane.showMessageDialog(null,String.format("환영합니다%s님",m.name));
		String mMenu=JOptionPane.showInputDialog("[회원관리메뉴]\n"
				+ "1.BMI \n"
				+ "2.학점(국어,영어,수학,과학,사회)\n"
				+ "3.성별체크(SSN)");
			switch (mMenu) {
			case "1" :
			String[] arr = JOptionPane.showInputDialog(null,"키,몸무게 입력").split(",");
			m.bmi(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]));
			JOptionPane.showMessageDialog(null,m.bmi(Double.parseDouble(arr[0]), Double.parseDouble(arr[1])));
				break;
			case"2":
			String[] ar = JOptionPane.showInputDialog(null,"국어 영어 수학 과학 사회 순으로 점수를 입력하세요").split(",");
			JOptionPane.showMessageDialog(null,m.grade(ar));
			break;
			case"3":
			String ssn = JOptionPane.showInputDialog(null,"주민등록번호를 입력하세요");
			JOptionPane.showMessageDialog(null,m.genderChecker(ssn));
			break;
			}
			case "2":
				String cMenu = JOptionPane.showInputDialog("[1.계산기 2.구구단 ]");
				Calc c = new Calc();
				switch (cMenu) {
				case "1" :
					String[] oMenu = JOptionPane.showInputDialog(null,"계산기").split(" ");
					switch(oMenu[1]) {
					case"+" : 
						JOptionPane.showMessageDialog(null,c.plus(Integer.parseInt(oMenu[0]),Integer.parseInt(oMenu[2]) ));
						break;
					case"-" : 
					JOptionPane.showMessageDialog(null,c.minus(Integer.parseInt(oMenu[0]),Integer.parseInt(oMenu[2]) ));
						break;
					case"*" :
						JOptionPane.showMessageDialog(null,c.multi(Integer.parseInt(oMenu[0]),Integer.parseInt(oMenu[2]) ));
						break;
					case"/" : 
						JOptionPane.showMessageDialog(null,c.division(Integer.parseInt(oMenu[0]),Integer.parseInt(oMenu[2]) ));
						break;
					case"%" : 
						JOptionPane.showMessageDialog(null,c.Percent(Integer.parseInt(oMenu[0]),Integer.parseInt(oMenu[2]) ));
						break;
					}
					break;
				case"2" :
					String dan = JOptionPane.showInputDialog(null,"구구단 숫자를 입력하세요");
					
					JOptionPane.showMessageDialog(null,c.gugudan(dan));
					break;
				}
				break;
			case"3":
				Lotto l = new Lotto();
				String Lotto = JOptionPane.showInputDialog(null,"준비되시면 1번을 눌러주세요");
				JOptionPane.showMessageDialog(null,l.randomNum());
				break;
			case"4":
				Mycalendar d =new Mycalendar();
				String res = JOptionPane.showInputDialog(null,"연도를 입력하세요");
				JOptionPane.showMessageDialog(null,d.Mycalendar(res));
			}
		}
	}	
}
