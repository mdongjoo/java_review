package map;

import java.util.HashMap;

public class HashMapTest1 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(map.toString());
		
		//추가 put(key, value)
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		System.out.println(map);
		
		System.out.println(map.put("A", 1));//key값 동일하면 값이 바뀐다 , 맵의 A키에 연관된 값이 있다면 해당 value값으로 반환
		//없다면 null로 반환한다 
		System.out.println(map);
	}
}
