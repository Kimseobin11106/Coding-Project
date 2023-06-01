package arrayTest;

import java.util.Scanner;

public class Ex03 {
	
	// int[] arr = new int[크기];
	// 배열 순회
	// for (int i=0; i<arr.length; i++) { }
	
	// 최대 100개까지의 정수를 차례로 입력 받다가
	// 0이 입력되면 입력을 중단하고,
	// 짝수번째 입력된 정수를 모두 출력하는 프로그램 작성
	public static void main(String[] args) {
		
		int arr[] = new int[100];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력해주세요.");
			
			int num = sc.nextInt();
			arr[i] = num;
			
			if (num == 0) {
				for (int j=1; j<arr.length; j+=2) {
					
					System.out.print(arr[j] + " ");
					
					if ((arr[j] == 0)) {
						break;
					}
				}
				System.out.print("0이 입력되어서 종료합니다.");
				break;
		  }
		}
		
	}
}
