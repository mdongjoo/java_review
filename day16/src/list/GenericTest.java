package list;

//제네릭을 사용하는 이유? 
	//1. 사용하지 않으면 필드에 타입별로 클래스를 만들어야한다
	//2. 제네릭 대신 Object 타입을 사용한다면 다운캐스팅을 사용해야한다
	//3. 타입을 제한할 수 있다 (Objext는 모든 타입을 다 받는다 ) 

class MyClass<T>{
	//필드 
	T data;

	
	//생성자
	public MyClass(T data) {
		super();
		this.data = data;
	}
	 //메소드 
	void printData() {
		System.out.println(data);
	}
	
}

public class GenericTest {
	public static void main(String[] args) {
		MyClass<String> mc = new MyClass<>("hi");
		System.out.println(mc);
		mc.printData();
		
		MyClass<Integer> mc2 = new MyClass<>(5);
		System.out.println(mc2);
		mc2.printData();
	}
}
