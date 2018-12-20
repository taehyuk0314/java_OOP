package bank06;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Member member= null;
		Account account = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌보기\n"
					+ "4.입금\n"
					+ "5.출금\n ")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료됩니다");
				return;
			case"1" :
				String id = JOptionPane.showInputDialog("아이디를 입력하세요");
				String name = JOptionPane.showInputDialog("이름을 입력하세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력하세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력하세요");
				member = new Member(id, name, ssn, pass);
				break;
			case"2":
				String info = member.info();
				JOptionPane.showMessageDialog(null,info);
				account = new Account(0);
				break;
			case"3":
				String inf =account.inf(member.name); 
				JOptionPane.showMessageDialog(null, inf);
				break;
			case"4":
				String inputMoney = JOptionPane.showInputDialog("입금액");
				String messege =  account.deposit(Integer.parseInt(inputMoney));
				JOptionPane.showMessageDialog(null, messege);
				break;
			case"5":
				String outputMoney = JOptionPane.showInputDialog("출금액");
				String messege1 = account.withdraw(Integer.parseInt(outputMoney));
				JOptionPane.showMessageDialog(null, messege1);
				break;
			}
		}

	}

}
