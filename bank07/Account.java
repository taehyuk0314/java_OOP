package bank07;

import java.util.Random;

public class Account {
	final static String BANK_NAME ="외한은행";
	String accountNum,today;
	int money;
		Account(int money){
			this.accountNum = accountNum;
			this.today = today;
			this.money= money;
		}
		public String accountNum1() {
			String accountNum1 = "";
			Random random = new Random();
			for(int i =0; i<8;i++) {
				if(i!=3) {
				accountNum1 += random.nextInt(10); 
			}else {
				accountNum1 += random.nextInt(10) +"-";
			}
			}
			return accountNum1;
		}
		public String today() {
			String today = "";
			return today;
		}
		
		public String menu(String name) {
			return String.format("은행:%s\n"
					+ "계좌번호:%s\n"
					+ "이름:%s\n"
					+ "날짜:%s\n"
					+ "잔액:%s\n",BANK_NAME,accountNum,name,today,money);
		}
}
