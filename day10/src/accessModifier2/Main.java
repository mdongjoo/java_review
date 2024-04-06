package accessModifier2;

import accessModifier.A;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		Child c = new Child();
		
		a.var1 = 9; // 1패키지에 public 
		
		c.method();
		System.out.println(a.var1);
//		System.out.println(a.var3);
	}
}
