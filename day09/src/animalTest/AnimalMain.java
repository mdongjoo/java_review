package animalTest; //패키지 

public class AnimalMain { //클래스 선언부 
	public static void main(String[] args) { //메인메소드 선언부 
		//Animal클래스
		//객체 2개 생성하고 메소드 호출 
		Animal a1 = new Animal("초코","강아지"); //매개변수 2개인 Animal생성자로 필드값 초기화하고 주소값을 객체 저장공간에 대입 
		Animal a2 = new Animal("푸바오","판다"); //매개변수 2개인 Animal생성자로 필드값 초기화하고 주소값을 객체 저장공간에 대입
		
		a1.printAnimal(); //객체 메소드 호출 
		System.out.println(a1.eat("사료")); //출력
		System.out.println(a1.sleep()); //출력
		
		a2.printAnimal();  //객체 메소드 호출 
		System.out.println(a2.eat("대나무")); //출력
		System.out.println(a2.sleep()); //출력
		
		
		
	}//메인 메소드 종료
} //클래스 종료 
