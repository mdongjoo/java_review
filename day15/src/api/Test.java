package api;

public class Test {
	public static void main(String[] args) {
		ApiTest2 at = new ApiTest2(); //외부 api 클래스 객체 생성
		
		System.out.println(at);
		
		//try -catch 단축키 alt shift z 
		try {
			at.div(5, 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다. ");
		}
		
		System.out.println("출력끝");
	}
}
