package car;

public class CarServiceImpl implements Carservice{

	@Override
	public Carbean info(String color, String gearType, int door) {
		Carbean carbean = new Carbean();
		carbean.setcolor(color);
		carbean.setgearType(gearType);
		carbean.setdoor(door);
		return carbean;
	}
		
}
