package accessModifier2;

//패키지내 클래스 import 받고 상속할수 있음 
import accessModifier.A;

public class Child extends A{
	//필드
	int num;
	
	//메소드
	void method() {
		var1 = 100; //public : 모든 곳에서 사용 가능 
//		var2 = 200; //default : 아예 다른 패키지에서 사용 불가능 
		var3 = 10; //protected 상속받았으니 가능 
	}
	
}
