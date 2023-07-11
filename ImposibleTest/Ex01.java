package ImposibleTest;

import java.util.Scanner;

public class Ex01 {
	
	// 2~9 중 번호를 입력받아 그 번호에 해당하는 구구단을 출력하시오.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		for (int i = 1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + ((dan*i)));
		}
	}

}
