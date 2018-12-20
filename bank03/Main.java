package bank03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			String menu = JOptionPane.showInputDialog("[메뉴]0.종료\n"
					+ "1.회원정보\n"
					+ "2.계좌등록\n"
					+ "3.계좌정보");
			switch (menu) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료");
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("아이디를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요");
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
