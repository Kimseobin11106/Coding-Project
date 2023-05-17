package Test;

import java.util.Scanner;

public class Ex03 {
	
	// 값을 하나 입력 받고, 
	// 1부터 1씩 증가하면서 누적합을 구하다가 입력받은 값 보다 커지는 순간 반복을 중단 하고,
	// 그 때 마지막으로 더해진 값과 총합을 출력하시오.
	// 예를 들어 
	// 10을 입력했다고 가정했을 때,
	// 1 + 2 + 3 + 4 + 5 이 때, 15가 되면서 10보다 커지므로, 반복을 멈추고
	// 출력은 5, 15 가 되면 된다.
	// 입력 : 1000 / 출력 45, 1035
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 하나 입력해주세요.");
		
		int num = sc.nextInt();
		int sum = 0;
		int i;
		
		for (i=1; ; i++) { 
			if (sum > num) {
				break;
			}
			sum += i;
		}
		
		System.out.println(i-1 + ", " + sum);
	}

}
