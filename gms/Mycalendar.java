package gms;

public class Mycalendar {
	public String Mycalendar(String res) {
		int res1 = Integer.parseInt(res);
		if((res1%4==0&&res1%100!=0)||res1%400==0) {
			res = "윤년";
		}else {
			res = "평년";
		}
		return res;
	}
}
