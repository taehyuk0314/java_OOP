package bank07;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		while(true) {
			switch (JOptionPane.showInputDialog("0종료,1.회원가입2.계좌생성3.잔액보기4.입금5.출금")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case"1":
				String id = JOptionPane.showInputDialog("아이디");
				String pass = JOptionPane.showInputDialog("비밀");
				String ssn = JOptionPane.showInputDialog("주민");
				String name = JOptionPane.showInputDialog("이름");
				Member member = new Member(id, pass, ssn, name);
				String info = member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case"2":
				
			}
		}
	}

}
