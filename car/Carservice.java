package car;

public class Carservice {
	public String info(String color,String gearType,int door) {
		return String.format("색은 :%s\n"
				+ "기어타입은:%s\n"
				+ "문 갯수는:%s\n",color,gearType,door);
	}
}
