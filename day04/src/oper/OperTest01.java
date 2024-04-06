package oper; //패키지 

public class OperTest01 { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//관계연산자 
		int num1 = 10 , num2 = 20 ; // ,을 이용해 정수형 변수에 값을 대입하여 선언 및 초기화 
		boolean isTrue = !false; //!false = true의 값을 논리형 변수에 대입 및 초기화 
		
		System.out.println(isTrue); //출력 
		System.out.println(10 == 20); //출력
		System.out.println(10 != 20); //출력
 		System.out.println("========="); //출력 
		//논리 연산자 
		  //&& 둘다 true여야만 true
	      System.out.println(true && true); 
	      System.out.println(false && true);
	      System.out.println(true && false);
	      System.out.println(false && false);
	      System.out.println("===============");
	      //|| 둘 중 하나라도 true면 true
	      System.out.println(true || true);
	      System.out.println(false || true);
	      System.out.println(true || false);
	      System.out.println(false || false);
	      System.out.println("===============");
	      System.out.println(num1 == 10 && num2 == num1);
	      System.out.println(num1 < 15 || num2 >= 20);
	      System.out.println(num1 < 15 && num2 > 20);
	      System.out.println("===============");      
	      System.out.println(!true);
	      System.out.println(!(num1 == 10));

	}//메인 메소드 종료 
} //클래스 종료 
