package interTest;

public class Main {
	public static void main(String[] args) {
//		Inter inter = new Inter(); //인터페이스 객체생성 불가 
		ClassA ca = new ClassA();
		ca.method1();
		ca.method2();
//		ca.VAR1 = 10 ; //상수
		System.out.println(ca.VAR1);
		System.out.println(ca.VAR2);
		Inter inter = new ClassA(); //업캐스팅 가능
		inter.method1();
		inter.method2();
}
}
