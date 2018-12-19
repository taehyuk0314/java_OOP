package bank4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class Account {
	final static String BANK_NAME ="국민은행";
	String accountNum,today;
	int money;
	public Account(int money) {
		this.accountNum = this.account1();
		this.money = money;		
		this.today = this.today();
	}
	public String account1() {
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
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);
		return today;
	}
	public String open(String name) {
		return String.format("1.은행:%s\n"
				+ "2.이름:%s\n"
				+ "3.날짜:%s\n"
				+ "4.잔고:%s\n",BANK_NAME,name,today,money);
	}
}
