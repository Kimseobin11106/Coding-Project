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
	
	// 생성자
	// 기본 생성자
	// 생성자도 오버로딩 가능
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name,int age) {
		this.name = name;
		if (age >= 0) {
			this.age = age;
		}
	}
	
	
	// getter & setter 
	//	자동 생성 : 우클릭 후 Source 에서 Generate Getter And Setter 를 클릭후 생성할 모든 변수를 누르면 생성 된다.!
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getCashAmount() {
		return cashAmount;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	
	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	// 메서드
	boolean transfer(Person to, int amount) {
		
		if (amount < 0 || account.getBalance() < amount) {
			System.out.println("이체 실패입니다. 잔고 :" + account.getBalance());
			return false;
		}
		
//		account.balance -= amount;
		account.setBalance(account.getBalance() - amount);
//		to.account.balance += amount;
		to.account.setBalance(account.getBalance() + amount); 
		
		System.out.println(name + "님이 " + to.name + "님께 " + amount + "원 이체하셨습니다. 잔고 : " + account.getBalance());
		
		return true;
	}
	
	
	
}