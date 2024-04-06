package innerTest;

public class OuterMain {
	public static void main(String[] args) {
		//외부 클래스의 인스턴스 생성
		Outer o = new Outer();
		System.out.println(o);
		
		//내부 클래스의 인스턴스 생성
		Outer.Inner  i = new Outer().new Inner();
		System.out.println(i);
		
		//Outer 외부클래스이 참조변수 o라는 것을 이용해서 
		//Inner 내부 클래스의 인스턴스를 생성
		Outer.Inner i1 = o.new Inner();
		System.out.println(i1);
		
		//
	}
}
