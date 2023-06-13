package chap_06;

public class _05_Overloading {
	
	public static int getPower(int num) {
		int result = num * num;
		return result;
	}
	
	public static int getPower(String strNum) {
		int num = Integer.parseInt(strNum);
		int result = num * num;
		return result;
	}
	
	public static int getPower(int num, int exp) {
		int result = 1;
		for (int i=0; i < exp; i++) {
			result *= num;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// 메소드 오버로딩
		// 같은 이름의 메소드를 여러번 선언
		// 1. 파리미터의 타입이 다르다.
		// 2. 파라미터의 갯수가 다르다.
		System.out.println(getPower(5));
		System.out.println(getPower("5"));
	}

}
