package print; //패키지명 print 

public class PrintTask { //접근제한자 public 모든 클래스 패키지에서 접근 허용/ 클래스명 PrintTask

	public static void main(String[] args) {//클래스 내 main메서드 접근제한자 public 반환값 void static 정적 미리 Method메모리에 올려둠
//      실습1 문자열을 수정하여 실행결과처럼 출력하세요
      //System.out.print("봄여름가을겨울");
      // 실행결과:
      // 봄
      //       여름
      // 가을
      //       겨울
      System.out.print("봄\n\t여름\n가을\n\t겨울\n"); //출력문 줄바꿈 없이
      
//      실습2
//      문자열타입 weather, 값은 맑음
//      정수형타입 month, 월
//      정수형타입 date, 일
//      실수형타입 max => 10.5253
//      실수형타입 min => 5.2535
      //+      	문자형 타입 요일
      
//      변수를 이용해서 printf 값을 출력
//      월 일의 최고 기온은 00.00입니다
//      월 일의 최저 기온은 00.000입니다
//      오늘의 날씨는 "맑음"입니다
      String weather = "맑음"; //문자열 변수에 값 맑음을 대입 
      char dayOfWeek = '월'; //문자형 변수에 값 월을 대입
      int month = 3; //정수형 변수에 3의 값대입
      int date = 11; // 정수형 변수에 11 값 대입
      double max = 10.5253; //실수형 변수에 실수값 대입
      double min = 5.2535; //실수형 변수에 실수값 대입
      
      System.out.printf("%d월 %d일의 최고기온은 %.2f입니다.\n",month, date,max); //출력문 pintf로 형식에 맞는 값을 출력하고
      System.out.printf("%d월 %d일의 최저기온은 %.3f입니다.\n",month, date,min); //서식문자를 이용해 값을 출력한다
      System.out.printf("오늘의 날씨는 \"%s\"입니다.\n",weather); //정수형 변수에 맞춰 d를 이용
      System.out.printf("오늘은 %c요일입니다.",dayOfWeek); //문자형 변수에 맞춰 서식문자%c 를 이용 


	}

}
