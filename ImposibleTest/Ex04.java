package ImposibleTest;

import java.util.Scanner;

public class Ex04 {
	
	// 어떤 정수 n을 입력받고, 
	// 1부터 홀수를 차례대로 더하면서 합이 n보다 크면 그 때까지 더한 홀수의 갯수와 그 합을 구하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for (int i = 1; ; i++) {
			if (i % 2 == 0) { // 반복문에 i+=2 를 사용해줘도 된다.
				continue;
			}
			if (sum > n) {
				break;
			}
			sum += i;
			cnt++;
			
		}
		
		System.out.println("더한 홀수의 갯수 : " + cnt + " 총합은 : " + sum);
	}

}
