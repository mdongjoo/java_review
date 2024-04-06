package task01;

public class Pizza extends Food{

	//생성자 
	public Pizza(String foodName, int foodPrice) {
		super(foodName, foodPrice);

	}
	//	가격을 계산하는 로직을 구현
	@Override
	public int calculatePrice() {
		return this.getFoodPrice();
	}
//	피자 의 이름을 반환하는 로직을 구현
	@Override
	public String getFoodName() {
		return this.getFoodName();
		
	}
}
