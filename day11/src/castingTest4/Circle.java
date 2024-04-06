package castingTest4;

//슈퍼클래스 shape을 상속받은 서브클래스 Circle 
public class Circle extends Shape{

	//필드
	double radius;
	@Override
	void draw() {
		System.out.println("원을 그립니다.");
	}
	
//	void CirArea(double radius) {
//		System.out.println("원의 넓이 :" + radius * radius * Math.PI);
//	} 
	double clacArea() {
		return radius * radius * Math.PI;
	}
}
