package anonymousTest;

public class Main {
	public static void main(String[] args) {
		InterA a = new ClassB() ;
		a.printData(); 
		
		InterA ia = new InterA() {//익명클래스 

			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println("InterA를 구현한 클래스에서 오버라이딩");
			}
			
		};
		ia.printData();
		System.out.println(ia);
	}
}
