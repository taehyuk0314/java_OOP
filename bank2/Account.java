package bank2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Account {
	final static String BANK_NAME ="국민은행";
	String accountNum,today;
	int money;
	Account(int money){
		this.accountNum =this.generatoraccountNum();
		this.money = money;
		this.today =this.today();
	}
	public String generatoraccountNum() {
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
		String today ="";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String  open(String name) {
		return String.format("은행:%s\n"
				+ "1.계좌번호:%s\n"
				+ "2.이름:%s\n"
				+ "3.날짜:%s\n"
				+ "4.잔액:%s\n",BANK_NAME,accountNum,name,today,money);
	}
}
