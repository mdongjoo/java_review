package exceptionTask;

import exceptionTask.MyException;

public class Account {
	//은행 계좌 클래스
	
	//필드 : 잔고 balance private 
	private int balance;
	//생성자 기본생성자만 추가
	public Account() {
		super();
	}
	//getter setter 
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//출금 메소드 : withdraw 매개변수 1개 
	//잔액보다 출금금액이 크다면 출금불가 예외처리 /현재 잔고는 -원 입니다  . 출금금액의 -원이 부족하여 출금이 불가능합ㄴ디ㅏ 출력
	void withdraw(int balance) throws MyException {
		if(this.balance < balance) {
			throw new MyException("현재 잔고는 "+ this.balance +"원 입니다. 출금 금액의 "+(balance- this.balance) +"원이 부족하여 출금이 불가능 합니다.");	
		}else {
			this.balance -= balance;
			System.out.println(balance + "원이 출금되었습니다 . 현 잔고는 "+ this.balance );
		}
		
	}

	//입금 메소드 :deposit 매개변수 1개 
	//잔액에 입금된 금액 추가후 입금된 금액은 -원 입니다 . 현재 잔고는 -원입니다 출력
	void deposit(int balance) {
		this.balance += balance;
		System.out.println("입금된 금액은 " + balance + "원 입니다 현재 잔고는 " + this.balance + "원 입니다. ");
	}
	//모든 예외처리는 메소드를 사용하는 쪽으로 던지기 
	
	//사용자 예외 정의 클래스 
	//MyException extends Exception 
		
}
