package task01;

public class Main {
//	   Burger, Pizza, Salad 클래스의 인스턴스 생성
//	   각 음식의 속성을 설정
//	   display() 메서드를 호출하여 각 음식의 정보를 출력
//	   calculatePrice() 메서드를 호출하여 각 음식의 가격 
	public static void main(String[] args) {
		Burger b = new Burger("치즈버거", 4000);
		Pizza p = new Pizza("치즈피자",30000);
		Salad s = new Salad("닭가슴살 샐러드", 5000);
		
		b.display();
		p.display();
		s.display();
		System.out.println(b.calculatePrice());
		System.out.println(p.calculatePrice());
		System.out.println(s.calculatePrice());
		
	}
	
	
	
}
