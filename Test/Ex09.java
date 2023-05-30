package Test;

import java.util.Scanner;

public class Ex09 {
	
	// 특정한 숫자까지 더해서 파이 값 구하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double buho = 1;
		double bunmo = 1;
		
		
		System.out.println("반복횟수 : ");
		int num = sc.nextInt();
		
		
		for (int i=0; i<num; i++) {
			sum += (4/bunmo) * buho;
			bunmo += 2;
			buho *= (-1);
		}
		System.out.println(sum);
	}

}
