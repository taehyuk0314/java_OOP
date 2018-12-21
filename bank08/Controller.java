package bank08;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean bean =null;
		MemberService memberService = new MemberServiceImpl();
	while(true) {
		switch (JOptionPane.showInputDialog("0.종료1.회원가입2.회원정보")) {
		case "0":
			JOptionPane.showMessageDialog(null, "종료");
			return;
		case "1" :
			bean = memberService.join(
					JOptionPane.showInputDialog("이름"),
					JOptionPane.showInputDialog("아이디"),
					JOptionPane.showInputDialog("비밀번호"),
					JOptionPane.showInputDialog("주민번호"));
			break;
		case"2" :
			String name = bean.toString();
			JOptionPane.showMessageDialog(null, name);
		}
	}
}
}
