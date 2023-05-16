package exam;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int result = 0;
		
		for (int i=1; i<4; i++) {
			for (int j=1; j<i+1; j++) {
				result = result + j;
			}
		}
		
		System.out.println(result);
	}

}
