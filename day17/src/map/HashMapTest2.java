package map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, Integer> mart = new HashMap<>();
		//추가 .put("키", 밸류)
		mart.put("새우깡",1500);
		mart.put("초코칩쿠키",2500);
		mart.put("포테토칩",2500);
		mart.put("칸쵸",2000);
		
		System.out.println(mart);
		
		//조회 .get("키")
		System.out.println(mart.get("새우깡"));
		
		//길이 .size()
		System.out.println(mart.size());
		
		//containsKey
		System.out.println(mart.containsKey("칸쵸"));
		//containsValue
		System.out.println(mart.containsValue(2500));
		
		//keySet
		System.out.println(mart.keySet());
		//키 하나만 가지고 오고싶을때
		//Iterator 
		Iterator<String> iter = mart.keySet().iterator();
//		System.out.println(iter.hasNext());
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//key value 한쌍 씩 가져오기 
		//내부 인터페이스 Entry 를 이용한다
		Set<Map.Entry<String,Integer>> items = mart.entrySet();
		for(Map.Entry<String,Integer> entry: items) {
			System.out.println(entry);
		}
		
	}
}
