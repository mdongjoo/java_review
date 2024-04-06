package task01;

public abstract class Food {
//	Food 추상 클래스
//	추상 메소드
//	calculatePrice()  음식의 가격을 계산하여 반환
//	getFoodName() 추상클래스에서 구현되지 않은 음식이름을 반환하는 메소
//	일반 메서드
//	   display()    
//	   "주문한 음식: [음식 이름], 가격: [음식 가격]" 음식정보 출력
	//로직
	//필드 String foodName, int foodPrice private 로 
	private String foodName; // 음식 이름
	private int foodPrice; //음식 가격 
	//생성자   
	public Food(String foodName, int foodPrice) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	
	//추상클래스 이므로 abstract 
	//추상 메소드 2개 calculatePrice() 매개변수 Food food ,  
	//getFoodName() Food food  반환값 없음 
	public abstract int calculatePrice();
	public abstract String getFoodName();
	
	//일반 메서드  
//	   "주문한 음식: [음식 이름], 가격: [음식 가격]" 음식정보 출력
	public void display() {
		System.out.println("주문한 음식 : [" + this.foodName + " ] , 가격: [" +this.foodPrice+ " ] " );
	}
	//private로 변수를 선언했으니 게터세터 만들기

	public String getFoodName(String foodName) {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	

}
