package bank06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME ="국민은행";
	String accountNum, today;
	int money;
	Account(int money ){
		this.accountNum = this.generatorAccount();
		this.today =this.year();
		this.money =money;
	}
	/**
	 * 입금
	 * */
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
	public String deposit(int money) {
		String message ="";
		if(money>=0) {
		this.money += money;
		message ="거래완료";
		}else {
			message = "입금액이 잘못되었습니다";
		}
		return message;
	}
	
	public String withdraw(int money) {
		String message="";
		if(money>0 && this.money>=money) {
		this.money -= money;
		message = "거래완료";
		}else {
			message ="입금액이 잘못되었거나 잔고가 부족합니다";
		}
		return message;
	}

	public String year() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public String inf(String name) {
		return String.format("%s\n1.계좌 %s\n"
				+ "2.이름 %s\n"
				+ "3.날짜 %s\n"
				+ "4.잔고%d",BANK_NAME,name,accountNum,today,money);
	}
	
}
