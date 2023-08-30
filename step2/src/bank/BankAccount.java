package bank;

public class BankAccount {
	
	private int balance;  // 잔고
	private Person owner; // 소유인 
	
	public void setBalance(int newBalance) {
		if (newBalance >= 0) {
			balance = newBalance;
		} else {
			System.out.println("올바른 값을 입력하세요.");
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	
//	입금 - deposit
//	파라미터 : 입급할 금액(정수)
//	리턴 : 성공여부(boolean)
	
	boolean deposit(int amount) {
		
		if (amount < 0 || owner.getCashAmount() < amount) { // 금액이 음수이거나, 넣을 금액이 현재 돈 보다 작을 클 때 
			System.out.println("입금 실패입니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount());
			return false;
		} 
		
		balance += amount;
//		owner.cashAmount -= amount;
		owner.setCashAmount(owner.getCashAmount() - amount);
		
		System.out.println(amount + "원 입금하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount());
		
		return true;
	}
	
	
//	입금 - deposit
//	환율 적용 입금 - depositWithExcangeRate
//  파라미터 : double excangeRate 환율
	
	boolean depositWithExchangeRate(double amount, double exchangeRate) {
		int newAmount = (int)(amount*exchangeRate);
		return deposit(newAmount);
		
	}
	
//	출금 - withdraw
//	파라미터 : 출금할 금액(정수)
//	리턴 : 성공여부(boolean)
	
	boolean withdraw(int amount) {
		
		if (amount < 0 || balance < amount) { // 금액이 음수이거나, 뺄 금액이 현재 통장의 돈 보다 클 때 
			System.out.println("출금 실패입니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount());
			return false;
		} 
		
		balance -= amount;
//		owner.cashAmount += amount;
		owner.setCashAmount(owner.getCashAmount() + amount);
		
		System.out.println(amount + "원 출금하였습니다. 잔고 : " + balance + "원, 현금 : " + owner.getCashAmount());
		
		return true;
	}
	
//	이체 - transfer
//	첫 번째 파라미터 - 받는 사람(Person) 
//	- ! String 으로 받으면 저장할 곳이 없기 때문에 Person 타입으로 받아준다.

//	두 번째 파라미터 - 이체 금액(정수)
//	리턴 : 성공여부(boolean)
	
	boolean transfer(Person to, int amount) {
		
		if (amount < 0 || balance < amount) {
			System.out.println("이체 실패입니다. 잔고 :" + balance);
			return false;
		}
		
		balance -= amount;
//		to.account.balance += amount;
		to.getAccount().balance += amount;
		
		System.out.println(owner.getName() + "님이 " + to.getName() + "님께 " + amount + "원 이체하셨습니다. 잔고 : " + balance);
		
		return true;
	}
	
//	이체 - transfer 계좌버전
	
	boolean transfer(BankAccount to, int amount) {
		
		return transfer(to.owner, amount); // 재활용 오버로딩 
		
		
//		if (amount < 0 || balance < amount) {
//			System.out.println("이체 실패입니다. 잔고 :" + balance);
//			return false;
//		}
//		
//		balance -= amount;
//		to.balance += amount;
//		
//		System.out.println(owner.name + "님이 " + to.owner.name + "님께 " + amount + "원 이체하셨습니다. 잔고 : " + balance);
//		
//		
//		return true;
		
	}

}