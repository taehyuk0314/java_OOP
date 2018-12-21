package phone;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
	PhoneBean phonebean = null;
	CelPhoneBean celPhoneBean = null;
	IPhoneBean iPhoneBean = null;
	AndroidPhoneBean aPhoneBean = null;
	while(true) {
		switch (JOptionPane.showInputDialog("0.종료\n"
				+ "1.일반전화기\n"
				+ "2.휴대폰\n"
				+ "3.아이폰\n"
				+ "4.안드로이드\n"
				+ "5.")){
		case "0":
			JOptionPane.showMessageDialog(null,"종료됩니다");
			return;
		case"1":
			/*
			 * 종류는 :일반전화기
			 * 제조사 : 금성
			 * 통화내용 : 안녕 
			 */
			phonebean = new PhoneBean();
			String company = JOptionPane.showInputDialog("전화기종류"); //금성
			String kind = JOptionPane.showInputDialog("제조사는?");
			String call =JOptionPane.showInputDialog("통화내용"); //안녕
			phonebean.setCompany(company);
			phonebean.setKind(kind);
			phonebean.setCall(call);
			JOptionPane.showMessageDialog(null,phonebean.toString() );
			break;
		case"2":
			celPhoneBean = new CelPhoneBean();
			 company = JOptionPane.showInputDialog("전화기종류"); //금성
			 kind = JOptionPane.showInputDialog("제조사는?");
			 String move = JOptionPane.showInputDialog("이동가능?");
			 call =JOptionPane.showInputDialog("통화내용"); //안녕
			celPhoneBean.setCompany(company);
			celPhoneBean.setKind(kind);
			celPhoneBean.setMove(move);
			celPhoneBean.setCall(call);
			JOptionPane.showMessageDialog(null,celPhoneBean.toString() );
			break;
		case"3":
			iPhoneBean = new IPhoneBean();
			 company = JOptionPane.showInputDialog("전화기종류"); //금성
			 kind = JOptionPane.showInputDialog("제조사는?");
			 move = JOptionPane.showInputDialog("이동가능?");
			 String data =JOptionPane.showInputDialog("검색"); //안녕
			 iPhoneBean.setCompany(company);
			 iPhoneBean.setKind(kind);
			 iPhoneBean.setMove(move);
			 iPhoneBean.setData(data);
			JOptionPane.showMessageDialog(null,iPhoneBean.toString() );
			/*
			 * 종류 : 아이폰
			 * 제조사 : 애플
			 * 이동성 : 이동가능함
			 * 검색 : 노래검색
			 */
			break;
		case"4":
			aPhoneBean = new AndroidPhoneBean();
			 company = JOptionPane.showInputDialog("전화기종류"); //금성
			 kind = JOptionPane.showInputDialog("제조사는?");
			 move = JOptionPane.showInputDialog("이동가능?");
			 String display = JOptionPane.showInputDialog("몇인치?");
			 data =JOptionPane.showInputDialog("검색"); //안녕
			 aPhoneBean.setCompany(company);
			 aPhoneBean.setKind(kind);
			 aPhoneBean.setMove(move);
			 aPhoneBean.setDisplay(display);
			 aPhoneBean.setData(data);
			JOptionPane.showMessageDialog(null,aPhoneBean.toString() );
			/*
			 * 종류: 안드로이드
			 * 제조사 : 삼성
			 * 이동성 : 이동가능함
			 * 디스플레이 : 6인치
			 * 검색: 영화보기
			 */
		}
	}
	}
}