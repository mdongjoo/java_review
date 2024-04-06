package castingTest4;

//슈퍼클래스 shape을 상속받은 서브클래스 Rectangle
public class Rectangle  extends Shape{
	//필드
	int width;
	int height;
	//메서드
	@Override
	void draw() {
		System.out.println("사각형을 그립니다");
	}
	
	double clacArea() {
		return width* height;
	}
//	void RecArea(int width, int height) {
//		System.out.println("사각형 넓이 :" + width* height);
//	}
}
