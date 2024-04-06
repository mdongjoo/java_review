package inheritanceTest2; //패키지 

public class TvMain { //클래스 선언부 
   public static void main(String[] args) {//메인 메소드 선언부 
      Tv tv = new Tv(); //객체생성 
      Tv2 tv2 = new Tv2();//객체생성 
      SmartTv st = new SmartTv();//객체생성 
      
      System.out.println(tv);//주소값 출력
      System.out.println(tv2);//주소값 출력
      System.out.println(st);//주소값 출력
      
      tv.chUp();//객체 메소드 호출
      tv2.volUp();//객체 메소드 호출
      
   }//메인 메소드 종료 
} //클래스 종료 
