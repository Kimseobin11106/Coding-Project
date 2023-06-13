package chap_06;

public class _02_Parameter {
	
	
	// 전달값이 있는 메소드
	public static void power(int num) { // num -> Paremeter
		int result = num * num;
		System.out.println(num + "의 2제곱은 " + result);
	}
	
	public static void powerByExp(int num, int exp) {
		// 코드 구현
		int result = 1;
		for (int i=0; i < exp; i++) {
			result = result * num;
		}
		System.out.println(num + "의 " + exp + "제곱은 " + result);

	}
	
	public static void main(String[] args) {
		
		power(5);	// Argument, 인수, 인자
		power(9);
		
		powerByExp(2, 3);
		powerByExp(4, 10);
	}
		

}
