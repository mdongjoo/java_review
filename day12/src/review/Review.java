package review;

public class Review {
	public static void main(String[] args) {
		//Review 클래스 메인 메소드 
		 moveSpeed(new Car(), 5);
		 moveSpeed(new Motocycle(), 5);
		 moveSpeed(new Truck(), 5);
	}
	//모든 메소드 출력하는 메소드 , 매개변수 2개 
	static void moveSpeed(Vehicle vehicle, int speed ) {
		vehicle.move();
		vehicle.setSpeed(speed);
		 System.out.println(vehicle.getClass().getSimpleName() +vehicle.getSpeed());
	}
}
