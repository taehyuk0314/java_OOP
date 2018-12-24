package bank41;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean bean = null;
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.회원 리스트\n"
					+ "4.회원찾기\n"
					+ "5.로그인\n"
					+ "6.회원수\n"
					+ "7.비밀번호변경\n")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case"1":
				bean = memberService.join(JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("아이디"),
						JOptionPane.showInputDialog("주민등록번호"),
						JOptionPane.showInputDialog("비밀번호"));
				break;
			case"2":
				JOptionPane.showMessageDialog(null, bean.toString());
				break;
			case"3":
				JOptionPane.showMessageDialog(null,memberService.list());
				break;
			case"4":
				JOptionPane.showMessageDialog(null, memberService.find(JOptionPane.showInputDialog("아이디를 입력하세요")));
				break;
			case"5":
				JOptionPane.showMessageDialog(null, memberService.login(JOptionPane.showInputDialog("아이디"),
						JOptionPane.showInputDialog("비밀번호"))
						?"로그인성공" : "로그인 완료");
				break;
			case"6" :
				JOptionPane.showMessageDialog(null, memberService.count());
				break;
			case"7":
				
				memberService.update(JOptionPane.showInputDialog("아아디는"), 
						JOptionPane.showInputDialog("비밀번호"), 
						JOptionPane.showInputDialog("새로운 비밀번호"));
				break;
			}
		}
	}
}
