package bank;

// 클래스 설계도
public class Person {
	
	// 필드 : 속성
	String name;	// 이름
	int age;		// 나이
	int cashAmount; // 현금 보유량
	BankAccount account; // 계좌 정보
	
	boolean transfer(Person to, int amount) {
		
		if (amount < 0 || account.balance < amount) {
			System.out.println("이체 실패입니다. 잔고 :" + account.balance);
			return false;
		}
		
		account.balance -= amount;
		to.account.balance += amount;
		
		System.out.println(name + "님이 " + to.name + "님께 " + amount + "원 이체하셨습니다. 잔고 : " + account.balance);
		
		return true;
	}
	
	boolean transfer(BankAccount to, int amount) {
		
		return transfer(to.owner, amount);
	}
	
}
