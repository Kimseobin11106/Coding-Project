package Exam;

import java.util.Scanner;

public class Ex01_Teacher {
	
	// 2번째 까지의 숫자를 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피보나치수열 몇 번째 항까지 출력할까요?");
		int num = sc.nextInt();
		
		int prevPrevNum = 1;
		int prevNum = 1;
		int sum = prevPrevNum + prevNum;
		
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for (int i = 3; i <= num; i++) {
			int curNum = prevPrevNum + prevNum;
			sum = sum + curNum;
			System.out.print(curNum + " ");
			
			prevPrevNum = prevNum;
			prevNum = curNum;
		}
		
		System.out.println();
		System.out.println(sum);
	}

}
