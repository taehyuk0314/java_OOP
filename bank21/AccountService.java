package bank21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	//서비스 로직에는 멤버변수를 두지 않는
	public String generatorAccount() {
		String res ="";
		Random random = new Random();
		for(int i =0; i<8;i++) {
			if(i!=3) {
				res+= random.nextInt(10);
			}else {
				res+= random.nextInt(10)+"-";
			}
		}
		return res;
	}
	public String year() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public String deposit(int money) {
		String message ="";
/*		if(money>=0) {
		this.money += money;
		message ="거래완료";
		}else {
			message = "입금액이 잘못되었습니다";
		}*/
		return message;
	}
	
	public String withdraw(int money) {
		String message="";
/*		if(money>0 && this.money>=money) {
		this.money -= money;
		message = "거래완료";
		}else {
			message ="입금액이 잘못되었거나 잔고가 부족합니다";
		}*/
		return message;
	}
	public String info(String accountNum ,String name,String today, int money) {
			return String.format("%s\n1.계좌 %s\n"
					+ "2.이름 %s\n"
					+ "3.날짜 %s\n"
					+ "4.잔고%d",Accountbean.BANK_NAME,accountNum,name,today,money);//상수는 클래스이름,상수이름
		}
}
