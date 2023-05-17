package Test;

import java.util.Scanner;

public class Ex04 {
	// 어떤 정수 n을 입력받고,
	// 1부터 홀수를 차례대로 더해 나가면서 합이 n보다 크면 그 때까지 더한 홀수의 개수와 그 합을 출력하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		
		for (int i=1; ; i++) {
			if (i%2 == 0) continue;
			if (sum > n) {
				break;
			} else {
				sum += i;
				cnt++;
			}
		}
		System.out.println(cnt + ", " + sum);
	}

}
