package tv;

public class TVservice {
	public void power() {}
	public void channelUp() {}
	public void channelDown() {}
	public String info(String brand,String color,int price) {
		return String.format("브랜드는:%s\n"
				+ "색은: %s\n"
				+ "가격은: %d",brand,color,price);
	}
	
}
