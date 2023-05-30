package Test;

import java.util.Scanner;

public class Ex06 {
	// 팩토리얼 계산기
	// 5! = 5*4*3*2*1
	// 어떤 수 num을 입력받으면 그 수의 팩토리얼을 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int	fact = 1; // 누적 곱을 구할 땐 항상 1로 초기화
		// int sum = 0; 누적 합을 구할 땐 항상 0으로 초기화
		
		while (num > 1) {
			fact = fact * num;
			num--;
		}
//		for (int i=num; i>1; i--) {
//			fact *= num;
//		}
		System.out.println(fact);
	}
	
}
