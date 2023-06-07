package arrayTest;

import java.util.Scanner;

public class Ex06 {
	
	// 10개의 정수를 입력받아 nums 에 저장한다. 
	// 입력받은 10개의 정수 중 가장 큰 수를 출력하는 프로그램을 생성
	
	public static void main(String[] args) {
		
		int nums[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int num;
		int max = 0;
		
		for (int i=0; i<nums.length; i++) {
			num = sc.nextInt();
			nums[i] = num;
			
			if (num > max) {
				max = num;
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.print(nums[i] + " ");
		}
		
		System.out.printf("\n10개의 정수중 가장 큰 수는 %d 입니다.", max);
		
	}

}
