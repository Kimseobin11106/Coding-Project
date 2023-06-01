package Test;

import java.util.Scanner;

public class Ex10 {
	// 피보나치 수열 
	// 입력한 숫자만큼 피보나치 수열 출력
	// 출력된 수열의 모든 합을 구해서 출력
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int fibo = 1;
		int a = 0;
		int b = 0;
		int sum = 0;
		for (int i=0; i<num; i++) {
			
			b = a + fibo;
			a = fibo;
			fibo = b;
			
			sum += fibo;
			System.out.println(fibo);
		}
		System.out.printf("총 합은 %d 입니다.",sum);
		
	}

}
