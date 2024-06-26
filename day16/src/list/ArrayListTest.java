package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.toString());
		//ArrayList 클래스의 객체를 출력시 []로만 출력되는 이유는 toStirng()이 오버라이딩 되어있기 때문이다 
		
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(3);
		System.out.println(al); //오브젝트 타입으로 추가하므로 2 , 5.5 'ㅊ' "string" 다 가능
		
		for(int i = 0 ; i< al.size() ;i++) {
			System.out.println(al.get(i));
		}
		
		//<Element> : 제네릭 
		ArrayList<Integer> al1 = new ArrayList<>();
		
		al1.add(3);
		for(int i = 0 ; i < 10 ;i++) {
			al1.add((10-i)*10);
		}
		System.out.println(al1);
		
		//빠른 for문 int 타입으로 auto unboxing 
		for(int data : al1) {
			System.out.println(data);
		}
		
		ArrayList<List> ll = new ArrayList<>();
		//자기 자신의 객체를 넣으면 this.Collection으로 나온다 
		ll.add(ll);
		System.out.println(ll);
		
	}
}
