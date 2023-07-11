package ImposibleTest;

import java.util.Scanner;

public class Ex06 {
	
	// 팩토리얼 계산기
	// 어떤 수 num를 입력받으면 그 수의 팩토리얼을 출력!!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		
		while (num > 1) {
			fact *= num;
			num--;
		}
		
		System.out.println(fact);	
	}

}
