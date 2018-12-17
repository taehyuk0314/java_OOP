package real;

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
			String temp = JOptionPane.showInputDialog(null,"키,몸무게 입력");
			String[] arr = temp.split(",");
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
				switch (cMenu) {
				case "1" :
					String oMenu = JOptionPane.showInputDialog("계산기");
					switch(oMenu) {
					case"1" : 
						
						break;
					case"2" : break;
					case"3" : break;
					case"4" : break;
					case"5" : break;
					}
					break;
				case"2" :
					Calc c = new Calc();
					String dan = JOptionPane.showInputDialog(null,"구구단 숫자를 입력하세요");
					
					JOptionPane.showMessageDialog(null,c.gugudan(dan));
					break;
				}
			case"3":
				Lotto l = new Lotto();
				String Lotto = JOptionPane.showInputDialog(null,"준비되시면 1번을 눌러주세요");
				JOptionPane.showMessageDialog(null,l.randomNum());
				break;
			}
		}
	}	
}
