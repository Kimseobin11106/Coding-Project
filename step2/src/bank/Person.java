package bank;

// 클래스 설계도
public class Person {
	
	// 클래스의 3요소 필드 메소드 생성자
	
	// 접근 제어자 4가지
	
	// default : 패키지 내 에 사용가능한 것
	// public : 다른 파일이든 상관 없이 어디든 사용할 수 있는 것
	// private : 클래스 내 에 사용 가능한 것
	// protected : 직접 상속 받은 클래스만 접근이 가능한 것
	
	// 필드 : 속성
	private String name;	// 이름
	private int age;	// 나이
	private int cashAmount; 	// 현금 보유량
	private BankAccount account; 	// 계좌 정보
	
	public void setAge(int newAge) {
		if (newAge > 0) {
			age = newAge;
		} else {
			System.out.println("올바른 나이를 입력하세요.");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setcashAmount(int newCashAmount) {
		if (newCashAmount > 0) {
			cashAmount = newCashAmount; 
		} else {
			System.out.println("올바른 값을 입력해주세요.");
		}
		
	}
	
	public int getCashAmount() {
		return cashAmount;
	}
	
	public void setBankAccount(BankAccount newBankAccount) {
		account = newBankAccount;
	}
	
	public BankAccount getBankAccount() {
		return account;
	}
	
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
