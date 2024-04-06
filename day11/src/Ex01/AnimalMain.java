package Ex01;

public class AnimalMain {
//	AnimalMain 클래스 
//	Animal 클래스의 객체 생성 
//	각 클래스의 객체 생성 메소드 : main메소드 
//	printCrying(Animal animal)메소드   
//	(조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
//	(각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)
	public static void main(String[] args) {
		//animal클래스의 객체 생성
		Animal a = new Animal();
		//각 클래스의 객체 생성 
		Cat c = new Cat();
		Dog d = new Dog();
		Mouse m = new Mouse();
		
		printCrying(c);
		printCrying(d);
		printCrying(a);
		printCrying(m);
		
	}
	//instance of : 객체 instance of 클래스 
	//반환값은 없고 매개변수로는 Aniaml 객체를 입력받는다 
	static void printCrying(Animal animal) {
		if(animal instanceof Animal) {
				animal.cry();
		}else {
			System.out.println("형변환 불가능 타입입니다. ");
		}
	}
	
}
