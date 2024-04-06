package animalTest; //패키지 

public class Animal { //클래스 선언부 
	//동물 클래스
	//필드
	//동물의 이름 , 나이  , 종류(species) 선언 
	String name;
	int age;
	String species;
	
	//생성자 
	//기본생성자 , 이름_종을 받는 생성자 , 모든 이름_나이_종을 받는 생성자 
	//this()사용
	public Animal() {//기본 생성자 
		
	}//생성자 종료 
	
	
	public Animal(String name, String species) { //매개변수 2개 인 생성자 
		this(); //기본생성자 호출 
		this.name = name; //자기자신 객체필드에 매개변수에서 받은 값을 대입 
		this.species = species;//자기자신 객체필드에 매개변수에서 받은 값을 대입 
	}//생성자 종료 


	public Animal(String name, int age, String species) {//매개변수 3개 인 생성자 
		this(name, species); //매개변수 2개인 생성자 호출해서 name, species 값 대입
		this.age = age; //자기자신 객체 필드에 매개변수에서 받은 값을 대입 
		
	}//생성자 종료 

	//메소드 
	//동물 정보 출력 메소드 이름_나이_종 출력 printAnimal(매개변수x, 리턴x) 
	void printAnimal() { //반환값 없고 매개변수 없는 메소드 
		System.out.println("동물의 이름 :"+this.name); //출력
		System.out.println("동물의 나이 :"+this.age); //출력
		System.out.println("동물의 종류 :"+this.species); //출력
	} //메소드종료 
	//eat(매개변수 o, 리턴값 o ->종 과 먹이 )
	// 동물이름가 먹이를 먹습니다 출력 
	String eat(String food) { //반환값 문자열 매개변수 문자열을 받는 메소드 
		System.out.println(this.name + "이/가 "+ food +"을/를 먹습니다."); //출력
		
		return this.species + food; //반환값 문자열 
	}//메소드 종료 
	//sleep (매개변수x ,리턴값o -> 종 리턴 ) 
	//동물이름이 잠을 잡니다.
	String sleep() { //반환값 문자열 매개변수 없는 메소드 
		System.out.println(this.name + "이/가 잠을 잡니다."); //출력
		return this.species; //리턴값 문자열 
	} //메소드 종료 
	//먹는다 , 울음소리를 낸다 , 달린다 ,  날수 있다 
	
	
	
}	//클래스 종료 
