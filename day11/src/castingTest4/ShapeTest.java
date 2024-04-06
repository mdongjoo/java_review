package castingTest4;

public class ShapeTest {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		System.out.println(r);
		
		polymorphism(new Circle());
		polymorphism(new Triangle());
		
		downcasting(r);
		
	}
	//참조변수의 다형성 기능을 할 메소드 
	static void polymorphism(Shape shape) {
		//업캐스팅 된 메소드 호출 
		shape.draw();
	}
	//다운 캐스팅 기능을 할 메소드
	//instanceof 연산자를 사용하여 객체의 실제 타입을 확인 
	static void downcasting(Shape shape) {
		double result =0;
		if(shape instanceof Circle) {
			result = ((Circle)shape).clacArea();
		}else if(shape instanceof Rectangle) {
			result = ((Rectangle)shape).clacArea();
		}else if(shape instanceof Triangle) {
			result = ((Triangle)shape).clacArea();
		}else {
			System.out.println("값이 잘못들어왔습니다.");
		}
		System.out.println(result);
	}
}
