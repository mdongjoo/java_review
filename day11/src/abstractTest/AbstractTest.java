package abstractTest;

public class AbstractTest {
	public static void main(String[] args) {
		ClassA a = new ClassB();
		System.out.println(a);
		ClassB b = new ClassB();
		System.out.println(b);
		
		a.method1();
		a.method2();
		b.method1();
		b.method2();
	}
	
}

