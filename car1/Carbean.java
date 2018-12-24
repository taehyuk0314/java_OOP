package car1;

public class Carbean {
	private String brand,color;
	int money;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return String.format("제품 브랜드는: %s\n "
				+ "색은 : %s\n"
				+ "가격은 : %d\n", brand,color,money);
	}
}
