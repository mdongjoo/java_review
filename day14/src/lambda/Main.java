package lambda;

public class Main {
	public static void main(String[] args) {
		FunctionalInter1 fi1 = new FunctionalInter1() {
			@Override
			public int add10(int num) {
				
				return 0;
			}
		};
		// 람다식 
		FunctionalInter1 fii = num -> num + 10;
		
	
	}
}
	
