package task;//패키지

public class Ex04 { //클래스 선언부 

//4. str1 = "abcdjavapythonclength"
//   str1 문자열에서 각 문자가 몇번 나타나는지 개수를 세어 출력하는 프로그램
//	[출력결과]
//			a : 
//			b : 
//			...
//			z : 
	//로직
	//str1 저장 
	//a-z를 저장할 배열 선언
	//
	//122-97 for 문 이용 
	public static void main(String[] args) {//메인메소드 선언부 
		String str1 = "abcdjavapythonclength"; //정수열 변수에 값을 대입하여 선언 및 초기화 
		int[] charAry = new int[26]; //정수형 배열 변수에 26칸 저장공간의 참조값을 대입 
		int cnt = 0 ; //정수형 변수에 초기값으로 선언 및 초기화 
		for(int i = 0 ;i <26;i++) { //for문 반복문 
			if( 'a'+i == (char)(i+97)) { //97은 a를 의미 
				cnt ++; //증감연산자 1씩 증가 
			} //if문 종료 
			
			charAry[i] = cnt ; // 증가된 cnt값을 정수형 배열에 인덱스에 맞게 값을 대입 
		} //for문 종료 
		//출력
		for(char c = 'a' ; c <= 'z' ; c++ ) { //for문을 이용해 출력
			System.out.print(c + " :" ); //출력
			
		}//for문 종료 
	} //메인 메소드 종료


} //클래스 종료 
