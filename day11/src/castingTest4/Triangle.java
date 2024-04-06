package castingTest4;

//슈퍼클래스 shape을 상속받은 서브클래스 Triange
public class Triangle extends Shape{
	//필드
	int base;
	int height;
	@Override
	void draw() {
		System.out.println("삼각형을 그립니다");
	}
	
	double clacArea() {
		return 0.5 * base * height;
	}
	//삼각형 넓이 구하는 메소드 
//	void TriArea(int base, int height) {
//		System.out.println("삼각형 넓이: " + 0.5 *base * height);
	//}
	
}
