package variable; //패키지명 variable

public class Task01 { //접근제한자 public 클래스명 Task01 선언부분 
	public static void main(String[] args) { //메인메소드 선언부분
		//이름과 나이와 취미를 변수에 저장하고 아래 형식대로 출력하기 
		// 제 이름은 000이고 , 나이는 0 살입니다. 
		// 제 이름은 000이고, 
		//취미는 000입니다. 
		//제 이름은 "000"이고,		나이는 '0'살입니다.
		// 	취미는 "000"입니다. 
		String name = "문동주"; //문자열 변수에 값을 대입하여 선언과 동시에 초기화 
		int age = 25;  //정수형 변수에 값을 대입하여 선언과 동시에 초기화 
		String hobby = "게임"; //문자열 변수에 값을 대입하여 선언과 동시에 초기화 
		
		System.out.println("제 이름은 "+ name + "이고 , 나이는 " + age + "입니다."); //출력문 "" + @ 는 문자열로 출력된다 
		System.out.println("제 이름은 "+ name + "이고,\n 취미는 "+ hobby+ " 입니다.");
		System.out.println("제 이름은 \""+ name + "\"이고, \t 나이는 \'"+ age +"\'살입니다.\n\t취미는 \""+hobby + "\"입니다.");
		System.out.println("내년엔 " + (age+1) + "살입니다.");
	}
}
