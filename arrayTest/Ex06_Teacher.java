package arrayTest;

import java.util.Scanner;

public class Ex06_Teacher {
	
	// 10개의 정수를 입력받아 nums 에 저장한다. 
	// 입력받은 10개의 정수 중 가장 큰 수를 출력하는 프로그램을 생성
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[10];
		int max;
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		max = nums[0];
		
		for (int i=1; i<nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println(max);
	}
	
	

}
