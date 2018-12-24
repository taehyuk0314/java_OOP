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
					+ "6.비밀번호 변경\n"
					+ "7.회원보기"
					+ "8.회원찾기"
					+ "9.로그인")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료됩니다");
				return;
			case"1" :
				memberService.join(
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
			case"7":
				MemberBean[] members = memberService.list();
				JOptionPane.showMessageDialog(null, members);
				break;
			case"8":
				JOptionPane.showMessageDialog(null, memberService.find(JOptionPane.showInputDialog("검색할 아이디")));
				break;
			case"9":
				String id = JOptionPane.showInputDialog("로그인 아이디");
				String pass = JOptionPane.showInputDialog("비밀번호");
//				if(memberService.login(id, pass)) {
//					JOptionPane.showMessageDialog(null, "로그인 성공");
//				}else{
//					JOptionPane.showMessageDialog(null, "로그인 실패");
//					
//				}
				JOptionPane.showMessageDialog(null,memberService.login(id, pass) ? "로그인 성공" :"로그인 실패");
			}
		}

	}

}
