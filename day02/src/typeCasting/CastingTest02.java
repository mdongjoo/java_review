package typeCasting; //패키지명 typeCasting 

public class CastingTest02 { //접근제한자 public 클래스명 CastingTest02
	public static void main(String[] args) { //접근제한자 public 정적키워드 static 반환값 void 메인메소드 
		//자동형변환
		//정수 + 정수 = 정수
		int num1 = 10 ;
		int num2 = 20;
		//10+20 = 30
		System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		
		//실수 + 실수 = 실수 
		double num3 = 10.5 , num4 = 5.3;
		System.out.printf("%.1f + %.1f = %.1f",num3, num4, num3 + num4);
		//정수 + 실수 = 실수
		System.out.println(num1 + num3);
		//실수형값이 제대로 나오지 않는 문제 : 부동 소수점 연산의 한계
		//부동소수점 연산 : 컴퓨터에서 실수를 표현하는 방법 중 하나, 정확도에 제한이 있다
		double number1 = 0.1 ;
		double number2 = 0.2;
		System.out.println(number1 + number2);//출력문 
	}
}
