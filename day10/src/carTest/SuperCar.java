package carTest;


public class SuperCar extends Car{
	//부모클래스 멤버  -> 생성자에 super() 호출기능이 있기 때문에 사용가능하다
	//필드  
	boolean booster;
	//메소드
	void boosterOn() {
		System.out.println("부스터가 켜졌습니다.");
	}
	void boosterOff() {
		System.out.println("부스터가 꺼졌습니다.");
	}
	
	//Alt shift s + v (오버라이딩 단축키)
	@Override
	void engineStart() {
		System.out.println("슈퍼카의 시동이 켜졌습니다.");
		System.out.println(super.toString());
	}
	@Override
	void engineStop() {
		System.out.println("슈퍼카의 시동이 꺼졌습니다.");
	}
	
	//생성자
	//매개변수를 4개 받는 생성자 
	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		this.booster = booster;
		//super(), this() 같이 사용할 수 없다 . 보통 상속시 super()를 사용한다. 
	}
	
	public SuperCar(boolean booster) {
		super();
		this.booster = booster;
	}
	
	
}
