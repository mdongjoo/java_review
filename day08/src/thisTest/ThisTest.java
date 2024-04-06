package thisTest;//패키지 

class Car{ //클래스 선언부 
	//필드  //문자열 필드 2개 정수형 필드 1개 선언 
	String brand;
	String color;
	int price;
	//메소드 
	void carInfo() { //반환값 없고 매개변수 없는 메소드 
		System.out.println(this.brand + "의 색은" + this.color + "입니다.");//출력
	} //메소드 종료 
	//생성자
	public Car() { //기본생성자 
		this("벤틀리","Red",50000);//자기 자신의 생성자 매개변수 3개짜리 를 호출하며 값 초기화 
	}//생성자 종료 
	public Car(String brand, String color) { //생성자 오버로딩 매개변수 2개인 생성자 
		this(brand, color,10000); //자기 자신의 생성자 매개변수 3개짜리 를 호출하며 값 초기화 
		System.out.println("생성자 실행"); //출력 
//		this.brand = brand;
//		this.color = color;
	}//생성자 종료 
	public Car(String brand, String color, int price) {//생성자 오버로딩 매개변수 3개인 생성자 

		this.brand = brand; //객체 필드에 값을 대입하여 초기화 
		this.color = color; //객체 필드에 값을 대입하여 초기화 
		this.price = price; //객체 필드에 값을 대입하여 초기화 
	} //생성자 종료 
	
	
}//클래스 종료 


public class ThisTest { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		Car c1 = new Car(); //객체 생성 
		Car c2 = new Car("BMW","white"); //매개변수 2개짜리 생성자를 통해 주소값을 객체에 대입해 생성 
		Car c3 = new Car("KIA","black",2000);//매개변수 3개짜리 생성자를 통해 주소값을 객체에 대입해 생성 
		System.out.println(c1.brand); //출력
		System.out.println(c2);//출력
		System.out.println(c2.price);//출력
		System.out.println(c3);//출력
		
		
	}//메인 메소드 종료 
} //클래스 종료 
