package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i =0 ; i<10 ;i++) {
			list.add((10-i)*10);
		}
		System.out.println(list);
		
		//Collections 클래스 : 컬렉션 프레임워크와 관련된 여러 메소드를 가지고 있다
		//일부 알고리즘도 구현해놓았다 
		//Static 메소드로 구현했기 때문에 객체를 만들 필요가 없다 
		
		//오름차순으로 정렬 
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());//정렬인데 reverse 해서 정렬 
		System.out.println(list);
		
		
		
		//Comparable 는 자바에서 객체를 비교하고 정렬하는데 사용되는 인터페이스이다 
		//comparable(T o1, T o2) : 두개의 객체 o1과 o2를 비교하는 메소드 
		//o1이 o2보다 작으면 음수를 , 크면 양수를 두객체가 같으면 0을 반환하는 메소드 
		//메소드를 구현하여 두 객체를 비교하는 비교 규칙을 정의할 수 있다 
		
		//equals(Object obj) : 두 객체의 동등성 비교 메소드 
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.reverse(list); //순서를 뒤집는 메소드 
		System.out.println(list);
		//최대 최소값 
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}
}
