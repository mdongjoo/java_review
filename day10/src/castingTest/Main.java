package castingTest;

public class Main {
	public static void main(String[] args) {
		//자료형 변수명 = 값 ;
		//클래스타입 참조변수명 = 참조값 ;
		Tv tv = new Tv();
		SmartTv sTv = new SmartTv();
		
		//tv 슈퍼클래스의 객체 : 필드 3 , 메소드 3 접근 가능
		//sTv 서브 클래스의 객체 : 필드 3, 메소드4 접근 가능 
		
		//업캐스팅 : 자식참조값을 부모 타입의 참조변수
		Tv tv2 = new SmartTv();
		//부모 클래스 타입의 참조변수로 자식 클래스 타입의 객체를 참조한다 
		//부모 클래스 타입의 참조 변수에 자식 클래스 타입의 객체의 주소값을 저장한다 
		//tv2 업캐스팅 객체 : 필드3 ,메소드 3접근가능
//		Smarttv sTv2 = new Tv(); -> 오류 이건 다운캐스팅이 아님
		System.out.println(tv2);
		Tv t3 = (Tv) new SmartTv();
		
		tv2.ch = 10 ;
		tv2.power = true;
		tv2.vol = 5;
		tv2.chUp();
		//2. Down Casting : 업캐스팅된 객체를 원래 본인의 클래스 타입으로 변환
		//강제형변환
		//자료형 변수명 = (자료형)값;
		SmartTv s1 = (SmartTv)tv2;
		s1.netflix();
		//다운캐스팅을 할때에는 반드시 업캐스팅된 값으로 해야한다 
		//업캐스팅된 값을 다시 원래 자식 타입으로 돌리는 것 
		
		
		
	}
}
