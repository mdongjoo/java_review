package task;//패키지 

public class Ex04_2 {//클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
//		4. str1 = "abcdjavapythonclength"
			//   str1 문자열에서 각 문자가 몇번 나타나는지 개수를 세어 출력하는 프로그램
//				[출력결과]
//						a : 
//						b : 
//						...
//						z : 
		//배열 없이
		//변수 선언(문자열 변수1개 ,cnt 횟수 저장할 변수 int )
		//각 문자의 횟수 카운팅( for , str1.length())
		//문자형 변수 = str1.charAt(i)
		//조건문 if a-z
		//switch(변수)
		
		//배열 사용
		String str1 = "abcdjavapythonclength"; //문자열 변수에 값을 대입하여 초기화 
		int[] charCount = new int[26]; //정수형 배열에 26칸 저장공간 참조값을 대입 
		for(int i = 0 ; i < str1.length(); i++) { //for문 반복문 배열의 길이만큼 반복 
			char ch = str1.charAt(i); //i번째 인덱스 값을 ch에 대입 
			if(ch >= 'a' && ch <= 'z') { //if문 a-z사이 값이면 참 
				charCount[ch - 'a']++; //인덱스 값에 따라 증감연산자로 1씩 대입 
			} //if문 종료 
		} //for문 종료 
		for(int i = 0 ; i < 26 ;i ++) { //for문 
			char ch = (char)('a'+ i); //char형으로 강제 형변환 하여 값을 대입 
				System.out.println(ch + " : " + charCount[i]); //출력
		} //for문 종료
	} //메인 메소드 종료 
} //클래스 종료
