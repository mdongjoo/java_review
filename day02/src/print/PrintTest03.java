package print; //패키지면 print

public class PrintTest03 { //접근제한자 public 클래스명 PrintTest03

	public static void main(String[] args) { //접근제한자 public 정적 Method메모리에 올려두어 메인메소드 
		//서식문자의 옵션
		System.out.println("안녕하세요 500"); 
		System.out.printf("%s %d\n","안녕하세요",500);
		System.out.printf("%-10.2s %d\n","안녕하세요",500);
		System.out.printf("%-10s %-10d","안녕하세요",500);
	}

}
