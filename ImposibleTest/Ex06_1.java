package ImposibleTest;

public class Ex06_1 {
	
	public static void main(String[] args) {
		
		int result = factorial(5);
		System.out.println(result);
		
	}
	
	public static int factorial(int num) {
		if (num == 1) {
			return 1; // return을 만나게되면 다음 return 없이 메소드가 종료된다.
		}
		
		return num * factorial(num-1); // 5 * 4! == 5!
	}
	
	
	
	// 5 * factorial(4)
	// 5 * 4 * factorial(3)
	// 5 * 4 * 3 * factorial(2)
	// 5 * 4 * 3 * 2 * factorial(1)
	// 5 * 4 * 3 * 2 * 1

}
