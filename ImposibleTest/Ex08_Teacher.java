package ImposibleTest;

import java.util.Scanner;

public class Ex08_Teacher {
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
		
		System.out.println("가로?");
		int rows = sc.nextInt();
		System.out.println("세로?");
		int cols = sc.nextInt();
		
		int[] seats = new int[rows * cols];
		
		for (int i=0; i<seats.length; i++) {
			seats[i] = (int)(Math.random()*(rows*cols)) + 1;
			for(int j=0; j<i; j++) {
				if(seats[i] == seats[j]) {
					i--;
				}
			}
		}
		
		for (int i=0; i<seats.length; i++) {
			System.out.printf("%5d ", seats[i]);
			if(i != 0 && (i + 1) % cols == 0) {
				System.out.println();
			}
		}
	}

}
