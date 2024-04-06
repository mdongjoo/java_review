package exceptionTask;

import exceptionTask.MyException;

public class AccountMain {
	public static void main(String[] args) {
		//메인메소드 
		Account a = new Account();
		//입금메소드 호출 
		a.deposit(2000);
		//출금메소드 호출 예외처리 던진거 받기 
		try {
			a.withdraw(3000);
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			a.withdraw(2000);
		} catch (MyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
