package inheritanceTest2; //패키지

public class Tv { // 클래스 선언부 
   // 기본기능만 있는 Tv Tv

   // 필드 정수형 변수 2개 논리형 변수 1개 선언 
   int ch;
   int vol;
   boolean power;

   // 메소드
   // 채널Up, 채널Down
   void chUp() { //반환값 없고 매개변수없는 메소드 
      System.out.println("현재 채널 : " + ch);//출력 
      System.out.println("채널을 올립니다 : " + ++ch);//출력 
   }//메소드 종료 

   void chDown() {//반환값 없고 매개변수없는 메소드 
      System.out.println("현재 채널 : " + ch);//출력 
      System.out.println("채널을 올립니다 : " + --ch);//출력 
   }//메소드 종료 

   // 볼륨Up, 볼륨Down
   void volUp() {
      System.out.println("현재 볼륨 : " + vol);//출력 
      System.out.println("볼륨을 올립니다 : " + ++vol);//출력 
   }//메소드 종료 

   void volDown() {
      System.out.println("현재 볼륨 : " + vol);//출력 
      System.out.println("볼륨을 올립니다 : " + --vol);//출력 
   }//메소드 종료 

   // 전원OnOff
   void powerOnOff() {//반환값 없고 매개변수없는 메소드 
      if (!power) {
         System.out.println("Tv를 켰습니다");//출력 
      } else {
         System.out.println("Tv를 껐습니다");
      }
   }

   // 생성자

}//클래스 종료 
