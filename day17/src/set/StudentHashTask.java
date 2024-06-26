package set;

import java.util.HashSet;

public class StudentHashTask {
	public static void main(String[] args) {
		//hashSet 객체 생성
		HashSet<Student> set = new HashSet<>();
		
		//Student 객체 생성 
		Student st1 = new Student(1, "문동주");
		//equals 메소드 테스트
		boolean isTrue = st1.equals(new Student(1,"홍길동"));
		System.out.println(isTrue); //기존 출력 false , equals 오버라이딩 이후 number로 비교 
		//Student 객체를 HashSet에 추가 
		set.add(st1);
		System.out.println(set.size());
		set.add(new Student(1,"홍길동"));
		System.out.println(set.size()); //오버라이딩하여 번호가 같으면 객체를 같다고 보고 값을 중복시키지 않는다 => 1
		
		
		
	}
}
