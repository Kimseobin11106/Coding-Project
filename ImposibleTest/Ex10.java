package ImposibleTest;

import java.util.Scanner;

public class Ex10 {
	// 계산기(메소드)
	// 두 개의 정수를 입력 받음
	// 사칙연산을 선택함 ( + - * / )
	// add 메소드, minus 메소드, multi 메소드, div 메소드 를 만들어서
	// 계산된 결과를 리턴받아 출력하시오.
	static int add(int n, int n2) {
		return n + n2;
	}
	
	static int minus(int n, int n2) {
		return n - n2;
	}
	
	static int multi(int n, int n2) {
		return n * n2;
	}
	
	static double div(int n, int n2) { // 나누기는 소수가 나올 수 있으니 double
		return (double)n / n2; // 나누기는 소수가 나올 수 있으니 double
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해주세요.");
		int num = sc.nextInt();
		
		System.out.println("두번째 정수를 입력해주세요.");
		int num2 = sc.nextInt();
		
		System.out.println("원하는 연산자를 입력해주세요.");
		String giho = sc.next();
		
		switch (giho) {
			case "+":
				System.out.println(add(num,num2));
				break;
			case "-":
				System.out.println(minus(num,num2));
				break;
			case "*":
				System.out.println(multi(num,num2));
				break;
			case "/":
				System.out.println(div(num,num2)); // 나누기는 소수가 나올 수 있으니 double
				break;
					
		}
	}
	

}
