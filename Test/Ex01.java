package Test;

import java.util.Scanner;

public class Ex01 {
	// 1~9 중 번호를 입력받아 그 번호에 해당하는 구구단을 출력하시오
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~9 중 번호를 입력해주세요");
		
		int a = sc.nextInt();
		
		// for (int i=1; i<=9; i++) {
		//	System.out.println(a + "*" + i + "=" + (a*i));
		// }
		
		for (int i=a; i<=a; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
}

