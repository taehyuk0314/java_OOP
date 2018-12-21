package bank31;


public interface AccountService {
	//서비스 로직에는 멤버변수를 두지 않는
	public String generatorAccount();
	/*
	 * 오늘 날짜 구하기
	 */
	public String year() ;
	/*
	 * 계좌정보 보여주기
	 */
	public String info(String accountNum ,String name,String today, int money) ;

	public String deposit(int money) ;
	
	public String withdraw(int money) ;
	
			
}
