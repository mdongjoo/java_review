package marvelheroes;

public class Hero {
//	// Hero.java - 기본 마블 히어로 클래스
//    private String name;
//    public void useSuperpower() {
//        System.out.println(name + "가(이) 슈퍼파워를 사용합니다.");
//    }
//
//    public void sayCatchphrase() {
//        System.out.println(name + "가(이) 대사를 외칩니다.");
//    }
	//필드
	private String name;
	//메소드 
	public void useSuperpower() {
		if(name == null) {
     System.out.println(this.name + "가(이) 슈퍼파워를 사용합니다.");
		}else {
			System.out.println("이름에 값이 들어가지 않았습니다 .");
		}
	}
	public void sayCatchphrase() {
		if(name == null) {
      System.out.println(this.name + "가(이) 대사를 외칩니다.");
		}else {
			System.out.println("이름에 값이 들어가지 않았습니다 .");
		}
	}
	//getter setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
