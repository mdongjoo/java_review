package carTest;

public class CarMain {
	public static void main(String[] args) {
		//부모 클래스의 객체
		Car c1 = new Car();
		Car c2 = new Car("BENZ", "black", 200000);
		//자식 클래스의 객체
		SuperCar sc2 = new SuperCar(true);
		System.out.println(sc2.booster);
		SuperCar sc1 = new SuperCar("BMW","blue", 100000, false);
		
		c2.engineStart();
		sc1.engineStart();
		
	}
}
