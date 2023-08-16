package bank;

// 클래스의 3요소 필드 메소드 생성자

// 접근 제어자 4가지 public private default protected

public class bankDriver {
	
	public static void main(String[] args) {
		/*
		 * 인스턴스를 생성하기 위해서는 '생성자'를 사용해야 한다. 생성자를 인스턴스를 생성하는 메소드 정도로 생각하면 된다. 
		 * 생성자는 new 키워드와 함께 클래스 이름과 동일한 이름으로 써준다.
		 */
		Person p1 = new Person(); // instance화 
		p1.name = "홍길동"; // instance 에만 적용 클래스에는 직접적인 영향 X]
		p1.age = 25;
		p1.cashAmount = 30000;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.cashAmount);
		
		BankAccount a1 = new BankAccount(); // 계좌
		a1.balance = 100000; // 잔고
		System.out.println(a1.balance);
		
//		두 객체의 관계를 설정
		p1.account = a1; // Person의 계좌를 BankAccount 로 등록
		a1.owner = p1; // BankAccount의 소유인을 Person 으로 등록
		
//		테스트
//		ooo님의 계좌 잔액은 ooo원 입니다.
//		p1 객체에 a1을 접근함으로, balance 에 접근 가능 | 직접 접근이 가능
		System.out.println(p1.name + "님의 계좌 잔액은 " + p1.account.balance + "원 입니다.");
		
//		출금
		a1.deposit(100000);
//		접근 방식 [Person 주체] 
		p1.account.deposit(20000);
//		음수값 확인
		p1.account.deposit(-10000);
		
//		이체
		a1.withdraw(10000);
//		접근 방식 [Person 주체]
		p1.account.withdraw(10000);
//		음수값 확인
		p1.account.withdraw(-10000);
	}
}
