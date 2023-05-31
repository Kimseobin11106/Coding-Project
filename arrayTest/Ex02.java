package arrayTest;

import java.util.Scanner;

public class Ex02 {
	
	// 스캐너 선언
	
	// 10칸짜리 정수형 배열 선언 - nums 
	
	// 반복문을 이용해서 임의의 정수값 10개 넣기 
	
	// 3칸짜리 정수형 배열 선언 - except 
	
	// except 배열에 1부터 10까지의 숫자 중 임의의 숫자 3개 입력
	
	// 문제는 except 배열에 있는 숫자번째에 해당하는 nums 배열의 값을 출력
	// 예를 들면 3, 6, 9 이면 nums 배열에 3번째 6번째 9번째 값을 출력
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[10];
		int except[] = new int[3];
		
		for (int i = 0; i<nums.length; i++) {
			System.out.println("입력하세요");
			nums[i] = sc.nextInt();
		}
		
		for (int i = 0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		for (int i = 0; i<except.length; i++) {
			System.out.println("excpet 입력하세요 (1~10)");
			except[i] = sc.nextInt();
		}	
		
		for (int i = 0; i<except.length; i++) {
			int tmp = 0;
			tmp = except[i];
			System.out.println(nums[tmp-1]);
		}	
	}
}
