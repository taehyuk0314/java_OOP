package car2;

public class CarServiceImpl implements CarService{

	@Override
	public Carbean add(String brand,String color,String gearType,int door) {
		Carbean carbean = new Carbean();
		carbean.setBrand(brand);
		carbean.setColor(color);
		carbean.setGearType(gearType);
		carbean.setDoor(door);
		return carbean;
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

}
