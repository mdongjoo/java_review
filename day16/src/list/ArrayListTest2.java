package list;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//추가
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(70);
		list.add(90);
		System.out.println(list);
		
		//값 가져오기 : index 번호로 특정 값 가져오기 
		System.out.println(list.get(1));
		
		//삭제 : index번호로 검색해서 삭제 (int 타입으로 넘겨줘야함 ) 삭제한 요소를 반환함 int
		System.out.println(list.remove(1)+ "을 삭제했습니다 ");
		//삭제 : 값으로 검색해서 삭제 (Object 타입으로 넘겨줘야함 ),삭제한 요소를 반환함 boolean
		System.out.println(list.remove(Integer.valueOf(90)));
		System.out.println(list);
		
		//ArrayList 요소값 전체 삭제 
//		list.clear();
//		System.out.println(list);
		
		//포함 여부 검사 
		System.out.println(list.contains(50));
		
		//수정 : 수정할 인덱스 와 값을 넘겨주어 수정할 수 있다 수정 되기 전의 값을 반환 
		try {
			System.out.println(list.set(1, 100));
		}catch(IndexOutOfBoundsException e) {//메소드 API주석설명에 throws가 있다면 예외처리를 고려한다 
			System.out.println("인덱스 범위 벗어남 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		
		
	}
}
