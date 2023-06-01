package Test;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		// 숫자를 입력받으면 그 수가 소수인지 판별하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for (int i=2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			} 
		
			
		}
		
		System.out.println(isPrime ? "소수" : "소수X");
	}

}
