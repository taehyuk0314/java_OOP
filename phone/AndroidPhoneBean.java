package phone;

public class AndroidPhoneBean extends IPhoneBean{ 
	private String display;
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getDisplay() {
		return display;
	}
	
	public String toString() {
		return String.format("종류는 %s\n"
				+ "제조사는 %s\n"
				+ "이동가능 %s\n"
				+ "큰화면:%s\n"
				+ "검색 %s\n",getKind(),getCompany(),getMove(),display,getData());
	}
}
