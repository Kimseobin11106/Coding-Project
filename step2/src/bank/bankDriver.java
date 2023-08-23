package bank;

public class bankDriver {
	
	public static void main(String[] args) {
		/*
		 * 인스턴스를 생성하기 위해서는 '생성자'를 사용해야 한다. 생성자를 인스턴스를 생성하는 메소드 정도로 생각하면 된다. 
		 * 생성자는 new 키워드와 함께 클래스 이름과 동일한 이름으로 써준다.
		 */
		Person p1 = new Person(); // instance화 

//		p1.name = "홍길동"; // instance 에만 적용 클래스에는 직접적인 영향 X]
		p1.setName("임꺽정");

//		p1.age = -15;
		p1.setAge(25);
		
//		p1.cashAmount = 30000;
		p1.setcashAmount(30000);
		
		Person p2 = new Person();
//		p2.name = "장발장";
		p2.setName("임창정");
		
//		p2.age = 20;
		p2.setAge(30);
		
//		p2.cashAmount = 100000;
		p2.setcashAmount(100000);
		
//		System.out.println(p1.name);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
//		System.out.println(p1.age);
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
//		System.out.println(p1.cashAmount);
		System.out.println(p1.getCashAmount());
		System.out.println(p2.getCashAmount());
		
		BankAccount a1 = new BankAccount(); // 계좌
		
		BankAccount a2 = new BankAccount(); // 계좌2
		
		a1.balance = 100000; // 잔고
		a2.balance = 500000;

//		System.out.println(a1.balance);
		
//		두 객체의 관계를 설정
		p1.setBankAccount(a1); // Person의 계좌를 BankAccount 로 등록
		a1.owner = p1;
		p2.setBankAccount(a2);
		a2.owner = p2; // BankAccount의 소유인을 Person 으로 등록
		
//		테스트
//		ooo님의 계좌 잔액은 ooo원 입니다.
//		p1 객체에 a1을 접근함으로, balance 에 접근 가능 | 직접 접근이 가능
//		System.out.println(p1.name + "님의 계좌 잔액은 " + p1.account.balance + "원 입니다.");
		
//		출금 테스트
//		System.out.println("p1의 통장잔액 : " + p1.account.balance);
//		a1.withdraw(50000);
//		System.out.println("p1의 통장잔액 : " + p1.account.balance);
		
//		이체 테스트
		System.out.println(p1.getName() + "의 통장잔액 : " );
		System.out.println(p2.getName() + "의 통장잔액 : " );
		a1.transfer(p2, 20000);
		System.out.println(p1.getName() + "의 통장잔액 : " );
		System.out.println(p2.getName() + "의 통장잔액 : " );
		a2.transfer(a1, 100000);
		System.out.println(p1.getName() + "의 통장잔액 : " );
		System.out.println(p2.getName() + "의 통장잔액 : " );
		p1.transfer(p2, 30000);
		System.out.println(p1.getName() + "의 통장잔액 : " );
		System.out.println(p2.getName() + "의 통장잔액 : " );
		p2.transfer(a1, 50000);
		System.out.println(p1.getName() + "의 통장잔액 : " );
		System.out.println(p2.getName() + "의 통장잔액 : " );
		
	}
}
