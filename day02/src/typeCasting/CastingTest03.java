package typeCasting; //패키지명 typeCasting 

public class CastingTest03 { //접근제한자 public 클래스명 CastingTest03
	public static void main(String[] args) { //접근제한자 public 정적키워드 static 반환값 void 메인메소드 
		//유니코드 값 확인
		char ch1 = 65;//A //유니코드로 숫자 65는 A를 뜻함 
		char ch2 = '가'; 
		System.out.println(ch1);//출력문 
		System.out.println((int)ch2); //문자형 변수를 int형으로 강제형변환 (유니코드)
		char ch3 = 97;//a
		
	}
}
