package phone;

public class IPhoneBean extends CelPhoneBean {
	private String data;
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	@Override
	public String toString() {
		return String.format("종류는 %s\n"
				+ "제조사는 %s\n"
				+ "이동가능 %s\n"
				+ "검색 %s\n",getKind(),getCompany(),getMove(),data);
	}
}
