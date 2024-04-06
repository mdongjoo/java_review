package ambiguity;

public class ClassB extends ClassA implements Inter1 { //구현 상속이 같이 있을때 상속먼저 해야 오류가 나지 않는다
	//ClassA , Inter1 둘다 printText() 메소드가 존재하지만
	//구현하는 인터페이스보다 상속받는 부모클래스의 우선순위가 높기 때문이다 
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.printText();
		
	}
	
}
