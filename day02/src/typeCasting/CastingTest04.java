package typeCasting; //패키지명 typeCasting 

public class CastingTest04 { //접근제한자 public 클래스명 CastingTest04
	public static void main(String[] args) { //접근제한자 public 정적키워드 static 반환값 void 메인메소드
		//강제형변환 :(자료형)값
		int num1 = (int) 5.24; //강제형변환
		System.out.println(num1);//출력문
		
		double num2 = 5 ; //자동형변환
		System.out.println(num2);//출력문
		
		System.out.println((char)97); //숫자를  강제형변환하여 유니코드에 맞추어 문자형으로 출력한다
	}
}
