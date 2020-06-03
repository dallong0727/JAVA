package exception.myexception;

public class Account {

	/*
	 * 1. 잔액(balance : long)으로 멤버변수를 선언 private 제한자
	 * 2. deposit 입금기능
	 * 3. withDrwa 출금기능
	 * 4. getBalace : long 잔액확인기능
	 * 
	 * 3. 출금 기능에서 잔액이 출금금액보다 작다면 예외를 발생시키는 코드를 작성해보세요.
	 * 
	 */
	private static long balance = 0;
	
	public static void deposit(int money) {
		balance += money;
		System.out.println("입금 되었습니다.");
		getBalace();
	}
	
	public static void withDrwa(int money) throws MyException {
		if(balance < money) {
			throw new MyException("잔액이 부족합니다.");
		} else {
			balance -= money;
			System.out.println("출금 되었습니다.");
			getBalace();
		}		
		return;
	}
	
	public static void getBalace() {
		System.out.println("현재 잔액은 " + balance + "입니다.");
	}
	
	public static void main(String[] args) {
		Account.deposit(10000);
	
		try {
			Account.withDrwa(12000);
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		}
	}
}
