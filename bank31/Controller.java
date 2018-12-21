package bank31;

import javax.swing.JOptionPane;

public class Controller {

	public static void main(String[] args) {
		MemberBean member= null;
		Accountbean account = null;
		AccountService service =  new AccountServiceImpl();
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌보기\n"
					+ "4.입금\n"
					+ "5.출금\n "
					+ "6.비밀번호 변경")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료됩니다");
				return;
			case"1" :
				member = memberService.join(
						JOptionPane.showInputDialog("아이디를 입력하세요"),
						JOptionPane.showInputDialog("이름을 입력하세요"),
						JOptionPane.showInputDialog("주민번호를 입력하세요"),
						JOptionPane.showInputDialog("비밀번호를 입력하세요"));
				
				break;
			case"2":
				account = new Accountbean();
				
				String accountNum = service.generatorAccount();
				account.setaccountNum(accountNum);
				String today = service.year();
				account.settoday(today);
				
				String sMoney =JOptionPane.showInputDialog("입금");
				int iMoney = Integer.parseInt(sMoney);
				account.setmoney(iMoney);
				
				String info2 =service.info(account.getaccountNum(), 
						member.getName(),
						account.gettoday(),
						account.getmoney());
				break;
			case"3":
				String inf =member.toString(); 
				JOptionPane.showMessageDialog(null, inf);
				break;
			case"4":
				String inputMoney = JOptionPane.showInputDialog("입금액");
//				String messege =  account.deposit(Integer.parseInt(inputMoney));
//				JOptionPane.showMessageDialog(null, messege);
				break;
			case"5":
				String outputMoney = JOptionPane.showInputDialog("출금액");
//				String messege1 = account.withdraw(Integer.parseInt(outputMoney));
//				JOptionPane.showMessageDialog(null, messege1);
				break;
			case"6" :
				String passch  = JOptionPane.showInputDialog("비밀번호를 변경해주세요");
				member.setpass(passch);
				break;
			}
		}

	}

}
