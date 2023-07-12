package ImposibleTest;

import java.util.Scanner;

public class Ex07 {
	
	// 어떤 숫자를 입력받고,
	// 해당 숫자까지의 홀수의 합과 짝수의 합을 구하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자는?");
		int num = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		
		for (int i=1; i<=num; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum2 += i;
			}
		}
		
		System.out.println("짝수의 합은 : " + sum + " 홀수의 합은 : " + sum2);
			
	}

}
