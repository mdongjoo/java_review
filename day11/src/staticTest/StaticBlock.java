package staticTest;

public class StaticBlock {
	static {
		//클래스 로드시에 실행되는 정적 블록
		System.out.println("클래스가 로드될 때 이블록이 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("메인 메소드 실행");
		//staticBlock  클래스가 로드될때 정적블록 내의 코드가 먼저 실행되고 
		//main 메소드의 코드가 실행됨
		//클래스 로드시에 한번 실행되는 것이 특징 
	}
}
