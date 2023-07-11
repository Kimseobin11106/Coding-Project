package ImposibleTest;

import java.util.Scanner;

public class Ex03 {
	
	// 값을 하나 입력 받고, 
	// 1부터 1씩 증가하면서 누적합을 구하는데
	// 입력받은 값 보다 누적합이 커지는 순간 반복을 중단
	// 마지막으로 더해진 값과 총합을 출력하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
