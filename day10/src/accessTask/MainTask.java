package accessTask;

public class MainTask {
	public static void main(String[] args) {
		//Animal 클래스
		//필드 : protected name
		//생성자 : 매개변수 1개
		//메소드 ; eat() => 00이가 먹이를 먹습니다 출력
		
		//Cat클래스
		//Animal 클래스를 상속받는 클래스
		//필드 : private 색상(color)
		//생성자 : 매개변수 없는 기본 생성자 
		//메소드 : play(매개변수 x, 리턴값x) => 00색 고양이 00가 놀고있습니다 출력 
		//scratch (매개변수x, 리턴값x) => 00이가 스크래치를 긁습니다 출력 
		Animal a = new Animal();
		Cat c = new Cat();
		
		a.name = "코루";
		c.name = "코리";
		
		
		a.eat();
		c.setColor("cream");
		c.play();
		c.scratch();
	}
}
