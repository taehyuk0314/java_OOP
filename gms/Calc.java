package gms;

public class Calc {
	public String plus(int a , int b) {
		return a+b+"";
	}
	public String minus(int a , int b) {
		return a-b+"";
	}
	public String multi(int a , int b) {
		return a*b+"";
	}
	public String division(int a , int b) {
		return a/b+"";
	}
	public String Percent(int a , int b) {
		return a%b+"";
	}
	public String gugudan(String dan) {
		String res ="";
		int dan2 = Integer.parseInt(dan);
		int[] gu  = new int[9];
		for(int i = 0; i<gu.length+1;i++) {
			if(i!=0) {
			res += dan+"x"+i+"="+dan2*i+"\n";
			}
		}
		return res;
	}
}
