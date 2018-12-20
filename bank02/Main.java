package bank02;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			String menu = JOptionPane.showInputDialog("[메뉴]0.종료 1.신상정보 2.계좌설립 3.잔액");
			switch(menu) {
			case"0":
				JOptionPane.showMessageDialog(null, "종료됩니다");
				return;
			case"1":
				String id =JOptionPane.showInputDialog(null,"아이디을 입력하세요");
				String name =JOptionPane.showInputDialog(null,"이름을 입력하세요");
				String pass =JOptionPane.showInputDialog(null,"비밀번호을 입력하세요");
				String ssn =JOptionPane.showInputDialog(null,"주민등록번호를 입력하세요");
				member = new Member(id, name, pass, ssn);
				String inif = member.inif();
				JOptionPane.showMessageDialog(null,inif);
				break;
			case"2":
				account = new Account(0);
				break;
			case"3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog( null,open);
				break;
			}
		}
	}

}
