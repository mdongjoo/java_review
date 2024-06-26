package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask {
	public static void main(String[] args) {
		//1부터 20까지의 난수를 만들어서 
		//ArrayList에 5개만 저장한다 
		//Random -> nextInt 20 을 넣으면 0-19까지 
		//1. 중복되는 값은 없다
		//2.정렬한다 sort Collections
		Random random = new Random();
		ArrayList<Integer> arr = new ArrayList<>();
		int num = 0;
//		for(int i = 0 ; i<5 ;) {
//			num = random.nextInt(20)+1;
//		if(!arr.contains(num)) {
//			arr.add(num);
//			i++;
//		}
//	}
		//while 문으로 바꾸기
		while(arr.size()<5) {
			num = random.nextInt(20)+1;
			if(!arr.contains(num)) {
				arr.add(num);
			}
		}
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
}
	}
