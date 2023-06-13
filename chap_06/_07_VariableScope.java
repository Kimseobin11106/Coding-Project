package chap_06;

public class _07_VariableScope {
	
	public static void methodA(int number) {
		
		System.out.println("A메서드에서 출력 : " + number);
//		System.out.println(result);
	}
	
	public static void methodB() {
		int result = 1; // 지역변수, 하나의 지역은 { } 사이를 의미함.
	}
	
	public static void main(String[] args) {
		
		int number = 3;
		methodA(number);
		
//		System.out.println(result);
		
		for (int i=0; i < 5; i++) {
			System.out.println(i);
			// i 도 지역변수이기 때문에 for문의 { } 사이에서만 사용할 수 있다.
		}
		
//		System.out.println(i);
		
		{
			int j = 0;
			System.out.println(j);
			System.out.println(number);
		}
		
//		System.out.println(j);
	}

}
