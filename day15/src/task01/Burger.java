package task01;

public class Burger extends Food{

//	   Food 추상 클래스를 상속하는 서브클래스
//	   각 클래스는 추상 메서드를 오버라이딩하여 음식의 가격 출력
//	 // 추상 메소드인 getFoodName()을 오버라이딩하여 햄버거의 이름을 반환하는 로직을 구현
//	 // 추상 메소드인 calculatePrice()를 오버라이딩하여 가격을 계산하는 로직을 구현
		//로직 
		//FOod추상 클래스를 상속 받기에 Extends키워드 
		//추상메소드 오버라이딩
		//업캐스팅된 매개변수를 받기에 각각의 메소드를 호출 
	//필드
	public Burger(String foodName, int foodPrice) {
		super(foodName, foodPrice);
		
	}
	//	가격을 계산하는 로직을 구현
	@Override
	public int calculatePrice() {
		return this.getFoodPrice();
	}
//	버거 의 이름을 반환하는 로직을 구현
	@Override
	public String getFoodName() {
		return this.getFoodName();
		
	}
	
}
