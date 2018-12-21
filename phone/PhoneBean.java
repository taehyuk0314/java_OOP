package phone;
/*
 * company 제조사
 * call 전화
 * kind 종류
 */
public class PhoneBean {
	private String company,call,kind;


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getCall() {
		return call;
	}


	public void setCall(String call) {
		this.call = call;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	@Override
		public String toString() {
		
			return String.format("종류는 %s\n"
					+ "제조사는 %s\n"
					+ "통화내용은 %s\n",kind,company,call);
		}
	
}
