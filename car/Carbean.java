package car;

public class Carbean {
	private String color,gearType;
	private int door; //문의 갯수
	
	
	
	public void setcolor(String color) {
		this.color =color;
	}
	public String getcolor() {
		return color;
	}
	public void setgearType(String gearType) {
		this.gearType =gearType;
	}
	public String getgearType() {
		return gearType;
	}
	public void setdoor(int door) {
		this.door =door;
	}
	public int getdoor() {
		return door;
	}
	public String toString(String color,String gearType,int door) {
		return String.format("색은 :%s\n"
				+ "기어타입은:%s\n"
				+ "문 갯수는:%s\n",color,gearType,door);
	}
}
