package arrayTest;

import java.util.Scanner;

public class Ex01 {
	
	// 5칸 정수형 배열을 생성한 후 
	// 아무 정수나 5개를 입력 받아 출력하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 5칸짜리 정수형 배열 생성
		int[] nums = new int[5];
		
		// 배열을 순회하는 방법 - 입력
		for (int i=0; i<nums.length; i++) {
			System.out.println(i + "번째 배열의 값 입력");
			nums[i] = sc.nextInt();	
		}
		
		// 배열을 순회하는 방법 - 출력
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		// 향상된 for문
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		
	}

}
