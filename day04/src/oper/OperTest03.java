package oper; //패키지 

public class OperTest03 { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		System.out.println(10 & 11); //비트 연산자 &
		System.out.println(10 | 11); //비트 연산자 |
		System.out.println(~10); //비트연산자not ~
		
		System.out.println("십진수 : "+10 + "이진수 :" + Integer.toBinaryString(10)); //정수값을 2진수로 만들어주는 메서드 
		System.out.println("십진수 : "+11 + "이진수 :" + Integer.toBinaryString(11));
		System.out.println("이진수 : " + Integer.toBinaryString(10&11));
		System.out.println("이진수 : " + Integer.toBinaryString(10|11));
		System.out.println("이진수 : " + Integer.toBinaryString(~10));

		System.out.println("===========");//출력문 
		
		System.out.println(10 << 1); //shift연산자 
		
	}//메인메소드 종료
} //클래스 종료 
