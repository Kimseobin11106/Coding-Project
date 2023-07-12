package ImposibleTest;

import java.util.Scanner;

public class Ex08 {
	
	// 랜덤 자리 뽑기
	// 행과 열을 입력 받음
	// 전체 자리수 행 * 열
	// 랜덤한 자리로 1부터 행 * 열 까지의 수를 임의로 부여함.
	// 예를 들어 3행 3열
	// 9 7 5
	// 1 4 6
	// 3 2 8 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hang = sc.nextInt();
		int ul = sc.nextInt();
		int[][] ran = new int[hang][ul];
		
		for (int i=0; i<ran.length; i++) {
			for(int j=0; j<ran.length; j++) {
				ran[i][j] = (int)(Math.random()*hang*ul) + 1;
				System.out.print(ran[i][j] + " ");
				
				
			}
		}
		

		
		
	}

}
