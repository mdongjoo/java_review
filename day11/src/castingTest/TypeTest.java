package castingTest;

public class TypeTest {
	public static void main(String[] args) {
		Parents p = new Parents();
		Child c = new Child();
		
		System.out.println(p);
		System.out.println(c);
		
		System.out.println("======클래스 객체 타입 비교=======");
		System.out.println(p instanceof Parents);
		System.out.println(c instanceof Parents);
		System.out.println(p instanceof Child);
		System.out.println(c instanceof Child);
		
		System.out.println("============캐스팅 시 클래스 객체 타입 비교 ============");
		//업캐스팅 
		Parents pp = new Child();
		
		System.out.println(pp);
		
		System.out.println(pp instanceof Parents);
		System.out.println(pp instanceof Child);
		//업캐스팅된 pp 객체를 다운 캐스팅
		Child cc = (Child) pp ; //강제 형변환
		
		System.out.println(cc instanceof Parents);
		System.out.println(cc instanceof Child);
		
	}
}
