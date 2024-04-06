package castingTest4;

//부모클래스 (수퍼클래스)
public abstract class Shape {
	//메소드
	void draw() {
		System.out.println("도형을 그립니다");
	}
	//추상 메소드 넓이 구하는 메소드
	   abstract double clacArea();
}
