package car1;

public class CarServiceImpl implements CarService{

	Carbean carbean = new Carbean();
	@Override
	public Carbean main(String brand, String color, int money) {
		carbean.setBrand(brand);
		carbean.setColor(color);
		carbean.setMoney(money);
		return carbean;
	}

	@Override
	public Carbean main1() {
		int money = carbean.getMoney();
		if(money>=1000000) {
			money =money- money/5;
		}else {
			money = money;
		}
		carbean.setMoney(money);
		return carbean;
	}

}
