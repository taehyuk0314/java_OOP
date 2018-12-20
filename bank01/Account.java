package bank01;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	final static String BANK_NAME ="국민은행"; //상수
	String accountNum,today;
	int money;
	Account(int money){
		this.accountNum =this.generatorAccountNum();
		this.money =money;
		this.today = this.today();
	}
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for(int i = 0; i<8;i++) {
			if(i==3) {
				accountNum += random.nextInt(10)+"-";
			}else {
				accountNum += random.nextInt(10);
			}
		}
		return accountNum;
	} 
	public String today() {
		String today ="";
		Date date = new Date(); 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			today = sdf.format(date);
			return today;
		
	}
	
	public String open(String name){
		return String.format("1.은행이름 : %s\n"
				+ "2.계좌번호: %s\n"
				+ "3.이름 : %s\n"
				+ "4.날짜 : %s\n"
				+ "4.입출금: %d",BANK_NAME,accountNum,name,today,money);
	}
}
