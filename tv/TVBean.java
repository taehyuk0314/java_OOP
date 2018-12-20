package tv;

public class TVBean {
	private String brand,color;
	private boolean power;
	private int chanel,price;  //가격
	
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public String getbrand() {
		return brand;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
	}
	public void setpower(boolean power) {
		this.power = power;
	}
	public boolean getpower() {
		return power;
	}
	public void setchanel(int chanel) {
		this.chanel = chanel;
	}
	public int getchanel() {
		return chanel;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public int getprice() {
		return price;
	}
	
	public String toString(String brand,String color,int price) {
		return String.format("브랜드는:%s\n"
				+ "색은: %s\n"
				+ "가격은: %d",brand,color,price);
	}
}

