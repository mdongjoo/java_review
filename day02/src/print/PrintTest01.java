package print; //패키지 print

public class PrintTest01 { //접근제한자 public으로 모든 패키지 메서드에서 접근 허용 , 클래스명 PrintTest01
	public static void main(String[] args) { // 접근제한자 public 정적 method메모리에 선언 반환값 void 메인메서드
		System.out.println("출력 메소드 연습"); //출력문 println 줄바꿈 
		System.out.print("print()메소드는 "); //출력문 print 줄바꿈 없음 
		System.out.print("줄바꿈이 되지 않는다.\n");
		System.out.println("println()메소드는 줄바꿈이 된다.");

	}
}
