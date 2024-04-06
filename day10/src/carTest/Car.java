package carTest;

public class Car {
	//필드 브랜드 , 색상 ,가격
	String brand;
	String color;
	int price;
	
	//메소드 
	//enginStart : 시동이 켜졌습니다 출력 (매개변수 x 리턴값x ) 
	//enginStop : 시동이 꺼졌습니다 출력 (매개변수 x 리턴값x ) 
	void engineStart() {
		System.out.println("시동이 켜졌습니다.");
	}
	void engineStop() {
		System.out.println("시동이 꺼졌습니다.");
	}
	//생성자
	//기본 생성자
	public Car() {
		super();
	}
	//매개변수 3개있는 생성자
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
}
