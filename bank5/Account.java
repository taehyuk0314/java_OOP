package bank5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "국민은행";
	String accountNum,today;
	int money;
	Account(int money){
		this.accountNum =this.accountNum1();
		this.today =this.today();
		this.money =money;
	}
	public String accountNum1() {
		String res = "";
		Random random = new Random();
		for(int i =0; i<8; i++) {
			if(i!=3) {
				res += random.nextInt(10);
			}else {
				res += random.nextInt(10)+"-";
			}
		}
		return res;
	}
	public String today() {
		String today="";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	
	public String open(String name) {
		return String.format("%s\n1.계좌:%s\n"
				+ "2.이름:%s\n"
				+ "3.시간:%s\n"
				+ "4.잔액:%d\n",BANK_NAME,accountNum,name,today,money);
	}
}
