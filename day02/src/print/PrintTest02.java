package print; //패키지명 print

public class PrintTest02 { //접근제한자 public 클래스명 PrintTest02
	public static void main(String[] args) { //접근제한자 public 정적 Method 메모리에 올려두고 프로그램 실행과 동시에 선언 메인메소드
		System.out.println("printf()메소드 연습");// println출력문
		System.out.println("내 java점수는 100점입니다.");
		System.out.printf("내 %s점수는 %d점 입니다","java\n",100); //printf출력문 서식문자를 이용해 형식에 맞는 값을 출력한다
		System.out.printf("내 평균 점수 %.2f점 입니다\n",88.3); //.2는 소수점 2자리 까지 출력하는 문법
		System.out.printf("내 학점은 %c 입니다\n" , 'A'); //c는 서식문자로 문자형을 출력한다
		System.out.printf("내 이름은 %s 입니다.\n", "슈퍼맨"); //s는 서식문자로 문자열을 출력한다
		
		//제 이름은 000이고, 나이는 0 살이고, 취미는 00입니다
		//printf로 출력
		System.out.printf("제 이름은 %s 이고 , 나이는 %d살이고, 취미는 %s입니다","문동주",25,"게임");
	}
}
