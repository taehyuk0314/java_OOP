package bank4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Account account =null;
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.신상 2. 계좌설립 3.계좌확인")) {
			case"0":
				JOptionPane.showMessageDialog(null,"종료");
				return;
			case"1":
				String id = JOptionPane.showInputDialog(null,"아이디를입력하세요");
				String pass = JOptionPane.showInputDialog(null,"비밀번호를입력하세요");
				String name = JOptionPane.showInputDialog(null,"이름를입력하세요");
				String ssn = JOptionPane.showInputDialog(null,"주민번호를입력하세요");
				member = new Member(id, pass, name, ssn);
				String nam = member.nam();
				JOptionPane.showMessageDialog(null, nam);
				break;
			case"2":
				account = new Account(0);
				break;
			case"3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null,open);
			}
		}
	}

}
