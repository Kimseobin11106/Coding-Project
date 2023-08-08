package bank;

public class bankDriver {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(); // instance화 
		p1.name = "홍길동"; // instance 에만 적용 클래스에는 직접적인 영향 X]
		p1.age = 25;
		p1.cashAmount = 100000;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.cashAmount);
	}
}
