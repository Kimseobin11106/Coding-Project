package chap_04;

public class _08_NestedLoop {
	
	public static void main(String[] args) {
		// 이중 for문, 이중 반복문
		
		// *****
		for (int i=0; i<5; i++) {
			System.out.println("*");
		}
		System.out.println();
		/*
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		for (int i=0; i<5; i++) { // 바깥 for문은 안쪽 for문을 시행한 후에 진행된다.
			for (int j=0; j<5; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 
		 * 
		 */
		for (int i=0; i<5; i++) { 
			for (int j=0; j<=i; j++) {
				System.out.println("*");
				
			}
			System.out.println();
			
		}
	}
}
