package car2;

public class Carbean {
	 private String brand,color,gearType;
	 private int door;
	 
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
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
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	 @Override
	public String toString() {
		return String.format("브랜드 :%s\n"
				+ "색:%s\n"
				+ "기어:%s\n"
				+ "문갯수:%d\n", brand,color,gearType,door);
	}
}
