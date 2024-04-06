package superTest;

public class SuperTest01 {
	public static void main(String[] args) {
		SuperTest01 st = new SuperTest01(); 
		System.out.println(st);
		st.method1();
		
		
		
	}
	
	void method1() {
		System.out.println("메소드1 호출");
	}
}
