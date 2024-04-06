package oper; //패키지 

public class OperTest04 { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		//비트연산자를  이용한 암호화 복호화
		int origin = 42 ; //원본메세지 
		int key = 99 ; //비트 마스크(암호화 및 복호화에 사용)
		
		//xor 연산을 통한 암호화 
		int encrypte = origin ^ key ;
		System.out.println("암호화된 메세지 :" +encrypte); //출력 
		int decrypte = encrypte ^ key ;
		System.out.println("복호화된 메세지 :" + decrypte); //출력 
		
	} //메인 메소드 종료
} //클래스 종료 
