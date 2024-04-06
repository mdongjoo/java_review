package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
		//MyThread 객체 t1, t2 생성
		MyThread t1 = new MyThread("#");
		MyThread t2 = new MyThread("*");
		
		//멀티쓰레드 실행은 start()메소드 
		//run() 메소드는 단순히 재정의한 코드를 실행 시킨것 
//		t1.run();
//		t2.run();
		t1.start();
		t2.start();
		
		for(int i = 0 ;i < 10 ;i ++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
