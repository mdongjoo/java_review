package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
	// 카페 메뉴
	//아메리카노 2000
	//카페라떼 2500
	//바닐라라떼 4000
	//초코라떼 4000
	
	//HashMap에 저장하기
	//출력과 입력
	//1.아메리카노 
	//2. 카페라떼 
	//3. 바닐라라떼 
	//4. 초코라떼 
	//번호를 선택하세여 : 2
	//카페라떼의 가격은 2500원입니다 .
		
		//로직 구성
	//HashMap <String , Integer> 객체 생성 key :음료 value : 가격
	//카페 음료 put 으로 넣기 
	//입력 Scanner import close 
	//화면 구성 
	// switch case 문 사용 
	//get을 이용해 value값을 출력 
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		//추가 put(key, value)
		map.put("아메리카노", 2000);
		map.put("카페 라떼", 2500);
		map.put("바닐라 라떼", 4000);
		map.put("초코 라떼", 4000);
		//Scanner 
		Scanner scan = new Scanner(System.in);
		//화면 구성 
		System.out.println("1.아메리카노");
		System.out.println("2.카페 라떼");
		System.out.println("3.바닐라 라떼");
		System.out.println("4.초코 라떼");
		System.out.print("번호를 선택하세요 :");
		//switch-case
		switch(scan.nextInt()) {
		case 1: //아메리카노 
			System.out.println("아메리카노의 가격은 "+ map.get("아메리카노")+ "입니다.");
			break;
		case 2: 
			System.out.println("카페 라떼의 가격은 "+ map.get("카페 라떼")+ "입니다.");
			break;
		case 3: 
			System.out.println("바닐라 라떼의 가격은 "+ map.get("바닐라 라떼")+ "입니다.");
			break;
		case 4: 
			System.out.println("초코 라떼의 가격은 "+ map.get("초코 라떼")+ "입니다.");
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		scan.close();
		
		
	}
}
