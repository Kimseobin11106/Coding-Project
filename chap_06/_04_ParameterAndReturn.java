package chap_06;

public class _04_ParameterAndReturn {

	
	public static int getPower(int num) {
		int result = num * num;
		return result;
	}
	
	public static int getPowerByExp(int num, int exp) {
		int result = 1;
		for (int i=0; i < exp; i++) {
			result = num * num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int val = getPower(5);
		System.out.println(val);
		
		System.out.println(getPower(7));
		
		val = getPowerByExp(4, 3);
		System.out.println(val);
	}
}
