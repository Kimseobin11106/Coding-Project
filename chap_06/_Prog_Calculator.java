package chap_06;

import java.util.Scanner;

public class _Prog_Calculator {

	public static int plus(int number, int number2) {
		int result = number + number2;
		
		return result;
		
	}
	
	public static int minus(int number, int number2) {
		int result = number - number2;
	

		return result;
		
	}
	
	
	public static int mul(int number, int number2) {
		int result = number * number2;
	
		
		return result;
	}
	
	public static double divide(int number, int number2) {
		if (number2 == 0) System.out.println("분모에 0이 올 수 없습니다!");
		double result = (double)number / number2;
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 종류(+,-,*,/) : ");
		String oper = sc.next();	
		
		
		switch (oper) {
			case "+" :
				System.out.println(plus(num1, num2));
				break;
			case "-" :
				System.out.println(minus(num1,num2));
				break;
			case "*" :
				System.out.println(mul(num1,num2));
				break;
			case "/" :
				System.out.println(divide(num1,num2));
				break;
			default :
				System.out.println("잘못된 연산자입니다.");
				
		}
		
		
		
	}
	
	

}
