package set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(1);
		System.out.println(list.size());
		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>(list);
		ArrayList<Integer> result = new ArrayList<>(set);
		System.out.println(set);
		System.out.println(result);
		
	}
}
