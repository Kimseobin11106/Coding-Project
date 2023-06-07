package arrayTest;

import java.util.Scanner;

public class Ex05 {
	
	// 연도와 월을 입력받아 해당 월의 날짜수를 출력하다가 월 입력때 0을 입력하면 종료한느 프로그램
	// (월을 잘못 입력하면 "잘못 입력하였습니다." 를 출력)
	public static void main(String[] args) {
		// 1단계 - 윤년 판단하는 조건문을 만들어보자.
		// 1-1. 4년마다 돌아오는 해는 윤년이다.
		// 1-2. 단, 4년마다 돌아오지만 100년 단위는 윤년이 아니다.
		// 1-3. 단, 100년 마다 돌아오짐나 400년 주기는 윤년이다.
		// 2단계 - 2월은 무조건 28일을 출력하는 프로그램 생성
		// 3단계 - 윤년 판단하여 2월을 28일과 29일을 구분하여 출력하는 프로그램 생성
		// 1 3 5 7 8 10 12 - 31일
		// 4 6 9 11 - 30일
		// 2 - 28일 or 29일
		
		Scanner sc = new Scanner(System.in);
		
//		1. 13칸 짜리 배열 생성
		int day[] = new int[13];
		int year, month;
		
//		2. 배열의 날짜의 수에 해당하는 데이터를 입력(단 0번 인덱스는 비워둠)
		for (int i = 1; i<day.length; i++) {
			if (i == 2) {
				day[i] = 28;
			} else if (i==4 || i==6 || i==9 || i== 11) {
				day[i] = 30;
			} else {
				day[i] = 31;
			}
		}
		
//		for (int i=0; i<day.length; i++) {
//			System.out.println(i + ", " + day[i]);
//		}
		
//		3. 무한반복문을 돌리면서 연과 월을 입력받아 날짜를 출력
		while (true) {
			System.out.println("년도 : ");
			year = sc.nextInt();
			System.out.println("월 : ");
			month = sc.nextInt();
			
			// 무한반복을 종료하는 방법
			if (month == 0) {
				break;
			}
			
			// 월을 잘못입력했을 때 예외처리 
			if (month < 1 || month > 12) {
				System.out.println("잘못 입력하였습니다. 월은 1부터 12까지의 정수 중 하나를 쓰셔야 합니다.");
				continue;
			}
			
			// 윤년 처리
			if (month == 2) {
				if (year%400 == 0 || ((year%4==0) && (year%100!=0))) {
					day[2] = 29;
				} else {
					day[2] = 28;
				}
			}
			
			System.out.printf("입력한 달의 날 수는 %d일 입니다.\n\n", day[month]);
		}
		
		
		
		
	}

}
