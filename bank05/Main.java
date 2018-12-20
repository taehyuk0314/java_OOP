package bank05;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			String menu = JOptionPane.showInputDialog("0종료 1회원가입 2. 계좌생성3.계좌확인");
			switch (menu) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료");
				return;
			case"1":
				String id = JOptionPane.showInputDialog("id입력");
				String pass = JOptionPane.showInputDialog("pass입력");
				String name = JOptionPane.showInputDialog("name입력");
				String ssn = JOptionPane.showInputDialog("주민번호입력");
				member = new Member(id, pass, name, ssn);
				String nam = member.nam();
				JOptionPane.showMessageDialog(null,nam);
				break;
			case"2":
				account = new Account(0);
				break;
			case"3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null,open);
				break;
			}
		}
	}
}
