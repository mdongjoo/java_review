package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		//로또 번호 생성 프로그램
		//1-45 까지의 숫자 중 6개의 서로 다른 숫자를 무작위로 선택하여 로또 번호 생성한다 
			//HashSet <Integer> 
			//Random random nextInt(45)+1			
		//출력될 때 오른차순으로 정렬하여 출력한다
			//Collections.sort()
		//사용자로부터 몇회차의 로또 번호를 생성할지 입력받고 각 회차별로 생성된 로또 번호를 출력한다
			//Scanner import close 
			//nextInt()
			//반복문 for
		//ArrayList<Integer> 메소드 
		//add 메소드로 추가 
		//출력 예시 
	//	몇 회차의 로또 번호를 생성하시겠습니까? 3
	//	1회차 로또 번호 : [3, 12, 31, 44, 54, 67] 입니다 
	//	2회차 로또 번호 : [3, 12, 31, 44, 54, 67]
	//	3회차 로또 번호 : [3, 12, 31, 44, 54, 67]
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("몇 회차의 로또 번호를 생성하시겠습니까?");
		num = scan.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < num ;i++) {
		HashSet<Integer> lotto = new HashSet<>();
		Random random = new Random();
	    //6번 반복하여 무작위 번호 lotto에 add로 넣어준다
		for(int j = 0; j < 6 ;) {
			if(lotto.add(random.nextInt(45)+1)) {
			j++;
			}
		}
//		System.out.println(lotto);
		list.addAll(lotto);
		Collections.sort(list);
		System.out.println(i+1+"번째 로또 번호 :"+list + " 입니다."); 
		list.removeAll(list);
		}
		scan.close();
	}
}
