package typeCasting; //패키지명 typeCasting

public class CastingTest01 { //접근제한자 public class 모든 패키지 클래스명 CastingTest01
	public static void main(String[] args) { //public 접근제한자 static 정적키워드 void 반환값 없음 메인메소드
		//자동형변환
		//정수(int) -> 정수(long)
		int iNum = 3; //정수형 변수에 3의 값을 대입
		long lNum = iNum; //정수형 타입중 범위가 큰 long 정수형에 정수형 변수int (4바이트)를 대입 
		//대입연산자 오른쪽에 있는 변수명은 값으로 해석할 수 있어야한다
		System.out.println(iNum);//iNum 출력문
		System.out.println(lNum);
		//강제형변환이 가능하다
		iNum =  (int) lNum ; //작은 타입에 큰타입을 넣을때는 강제형변환시켜준다
		//실수(flaot 4) -> 실수(double 8)
		float fNum = 3.14f; //실수형 변수 float 변수에 3.14를 대입 float로 선언시 값에 f를 붙여준다
		double dNum = fNum ; //double 실수형 변수 dNum에 float 실수형 변수를 대입 큰 타입에 작은 타입 넣을때에는 자동형변환 가능하다 
		System.out.println(fNum); //출력문 println 
		System.out.println(dNum); //소수점 15자리까지 
		//강제형변환이 가능하다
		fNum = (float) dNum ; //작은타입에 큰타입을 넣을 때에는 강제형변환을 해준다 
	}
}
