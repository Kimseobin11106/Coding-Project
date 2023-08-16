package bank;

public class BankAccount {
	
	int balance;  // 잔고
	Person owner; // 소유인 
	
//	입금 - deposit
//	파라미터 : 입급할 금액(정수)
//	리턴 : 성공여부(boolean)
	
	boolean deposit(int amount) {
		
		if (amount < 0 || owner.cashAmount < amount) { // 금액이 음수이거나, 넣을 금액이 현재 돈 보다 작을 클 때 
			System.out.println("입금 실패입니다. 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
			return false;
		} 
		
		balance += amount;
		owner.cashAmount -= amount;
		
		System.out.println(amount + "원 입금하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
		
		return true;
	}
	
//	출금 - withdraw
//	파라미터 : 출금할 금액(정수)
//	리턴 : 성공여부(boolean)
	
	boolean withdraw(int amount) {
		
		if (amount < 0 || balance < amount) { // 금액이 음수이거나, 뺄 금액이 현재 통장의 돈 보다 클 때 
			System.out.println("입금 실패입니다. 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
			return false;
		} 
		
		balance -= amount;
		owner.cashAmount += amount;
		
		System.out.println(amount + "원 출금하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.cashAmount);
		
		return true;
	}
	
//	이체 - transfer
//	첫 번째 파라미터 - 받는 사람(Person) 
//	- ! String 으로 받으면 저장할 곳이 없기 때문에 Person 타입으로 받아준다.

//	두 번째 파라미터 - 이체 금액(정수)
//	리턴 : 성공여부(boolean)
	
	boolean transfer(Person person, int amount) {
		
		return true;
	}

}
