package methodOverloading; //패키지 

public class ValueTest { //클래스 선언부 
	public static void main(String[] args) { //메인 메소드 선언부 
		ValueTest vt = new ValueTest(); //객체 생성 
		
		int num = 1;	//기본자료형 
		int[] arr = {1};	//reference타입
		
		//변수 자체를 보내보면 call by value
		vt.add_value(num);
		System.out.println(num);//값의 변화가 없다
		//배열 자체를 보내보면 call by reference
		vt.add_reference(arr);
		System.out.println(arr[0]);//값의 변화가 있다
		
	}//메인 메소드 종료 
	
	void add_value(int num) { //지역 메소드 매개변수 1개 선언 
		num += 100 ; //정수형 변수에 100저장
		System.out.println(num); //출력
	} //메소드 종료 
	void add_reference(int[] arNum) {//지역 메소드 정수형 배열 매개변수 1개 선언 
		arNum[0] += 100 ; //배열 첫번째 저장공간에 100저장 
		System.out.println(arNum[0]); //출력 
	} //메소드종료 
}//클래스 종료 
