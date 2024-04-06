package interMethod;

public class InterfaceMain {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
//		MyClass.abstractMethod(); //구현은 인터페이스에 있기에
		MyInterface.staticMethod();
		//구현된것 기준 
		mc.defaultMethod();
		mc.abstractMethod();
		
	}
}
