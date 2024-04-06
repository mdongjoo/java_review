package fanTest;

public class BasicFan2 implements Fan {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("리모컨으로 전원을 켰습니다 ");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("리모컨으로 전원을 껏습니다 ");
	}

	@Override
	public void turbo() {
		// TODO Auto-generated method stub
		System.out.println("터보");
	}

}
