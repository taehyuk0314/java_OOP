package bank21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Accountbean {
	public final static String BANK_NAME ="국민은행";
	private String accountNum, today;
	private int money;

	/**
	 * 입금
	 * */
	public void setaccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getaccountNum() {
		return accountNum;
	}
	public void settoday(String today) {
		this.today =today;
	}
	
	public String gettoday() {
		return today;
	}
	
	public void setmoney(int money) {
		this.money =money;
	}
	public int getmoney() {
		return money;
	}


	public String toString() {
		return String.format("1.계좌 %s\n"
				+ "3.날짜 %s\n"
				+ "4.잔고%d",accountNum,today,money);
	}
	
}
