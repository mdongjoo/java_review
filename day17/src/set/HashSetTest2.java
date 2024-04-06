package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		//hash set 순서보장 x 중복 허용 x
		HashSet<String> set = new HashSet<>();
		
		//add 추가 메소드 
		set.add("java");
		set.add("dbms");
		set.add("jdbc");
		set.add("web");
		set.add("jsp");
		set.add("spring boot");
		System.out.println(set);
		
		//remove(Object o) : 지정된 요소를 세트에서 제거 
		set.remove("java");
		System.out.println(set);
		
		//contains(Object o) : 지정된 요소가 세트에 있는지 여부 확인 
		System.out.println(set.contains("jdbc"));
		System.out.println(set.contains("java"));
		
		//size() : 세트의 요소수를 반환
		System.out.println(set.size());
		
		//isEmpty() : 세트가 비어있는지 확인
		System.out.println(set.isEmpty());
		
		//clear() : 세트의 모든 요소 제거 
//		set.clear();
//		System.out.println(set);
		
		//반복자 Iterator : 세트의 요소에 대한 반복자를 반환 , 반복자를 사용하여 세트의 요소를 반복할 수 있다 
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		
		
	}
}
