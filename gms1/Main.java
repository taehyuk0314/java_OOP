package gms1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2. 회원정보")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료됩니다");
				return;
			case"1":
				String hakbun = JOptionPane.showInputDialog("학번을 알려주세요");
				String name = JOptionPane.showInputDialog("이름을 알려주세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 알려주세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 알려주세요");
				Student student = new Student(hakbun, name, ssn, pass);
				JOptionPane.showMessageDialog(null,student);
				break;
			case"2":
				
				break;
			}
		}
	}
}
