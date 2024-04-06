package review;

public class Main {
	public static void main(String[] args) {
		//익명클래스를 이용해 계산기 생성
		Cal a = new Cal() {
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
			
			@Override
			public int sub(int num1, int num2) {
				return num1 > num2 ?  num1 - num2 : num2 - num1  ;
			}
		};
		//계산기 메소드 2개 출력
		System.out.println(a.add(4, 6));
		System.out.println(a.sub(3, 10));
		
	}
}
