package ImposibleTest;

import java.util.Scanner;

public class Ex10_Teacher {
	// 계산기(메소드)
	// 두 개의 정수를 입력 받음
	// 사칙연산을 선택함 ( + - * / )
	// add 메소드, minus 메소드, multi 메소드, div 메소드 를 만들어서
	// 계산된 결과를 리턴받아 출력하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수");
		int num1 = sc.nextInt();
		System.out.println("두번째 수");
		int num2 = sc.nextInt();
		System.out.println("원하는 연산은? (+ - * /) ");
		String op = sc.next();
		double result = 0.0; // 나누기는 소수가 나올 수 있으니 double
		
		switch (op) {
			case "+":
				result = add(num1, num2);
				break;
			case "-":
				result = minus(num1, num2);
				break;
			case "*":
				result = multi(num1, num2);
				break;
			case "/":
				result = div(num1, num2);
				break;
			default:
				System.out.println("잘못 입력되었습니다.");
		}
		
		System.out.println("결과 : " + result);

	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double div(int num1, int num2) { // 나누기는 소수가 나올 수 있으니 double
		return (double)num1 / num2;
	}

}
