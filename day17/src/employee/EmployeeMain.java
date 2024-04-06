package employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {
	public static void main(String[] args) {
//		1. 회사의 사원들의 정보를 HashMap에 저장한다
//		HashMap의 Key는 사원의 ID(String)
//		Value는 이름, 나이, 부서로 설정
	
		Employee e1 = new Employee("짱구", 5, "영업부");
		Employee e2 = new Employee("철수", 5, "개발부");
		Employee e3 = new Employee("유리", 5, "사업부");
	
		//HashMap으로 객체 생성
//		조건1. 새로운 사원정보를 추가
//		001, 짱구, 5, "영업부"
//		002, 철수, 5, "개발부"
//		003, 유리, 5, "사업부"
		HashMap<String, Employee> employee1 = new HashMap<>();
		employee1.put("001", e1);
		employee1.put("002", e2);
		employee1.put("003", e3);
		System.out.println(employee1);

//		조건2. 특정 ID의 사원 정보를 조회
		//key 값으로 조회 get 
		System.out.println(employee1.get("001"));
		System.out.println(employee1.get("002"));
		System.out.println(employee1.get("003"));
//		조건3. 모든 사원의 정보를 출력
//		entrySet 메소드사용
		//key value 한쌍 씩 가져오기 
		//내부 인터페이스 Entry 를 이용한다
		Set<Map.Entry<String,Employee>> items = employee1.entrySet();
		for(Map.Entry<String,Employee> entry: items) {
			System.out.println(entry);
		}
//		조건4. 특정 ID의 사원 정보를 삭제
		//remove() 메소드 이용
		//짱구 삭제 
		employee1.remove("001");
//		employee1.remove("002");
//		employee1.remove("003");
		System.out.println(employee1);
//		조건5. 모든 사원 정보를 삭제
//		clear 메소드 사용
		//clear()사용 
		employee1.clear();
		System.out.println(employee1);
		
		
		
		
		//value를 클래스 타입으로 수정해서 만들어보기 
	}
}
