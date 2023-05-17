package Test;

import java.util.Scanner;

public class Ex02 {
	// 입력받은 정수만큼(랜덤하게 정함) 성적을 입력받아서 총점과 평균을 출력하시오.
	// 총 0명의 학생의 총점은 00이고, 평균은 00.0점이다.
	// 몇 명의 성적을 입력받겠습니까?
	// 5명
	
	// 5명의 데이터를 입력받아서 처리
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 명의 성적을 입력받겠습니까?");
		int num = sc.nextInt();
		
		int score;
		int sum = 0;
		for (int i=0; i<num; i++) {
			score = sc.nextInt();
			sum += score;
		}
		
		System.out.printf("총 %d명 학생의 총점은 %d점 이고, 평균은 %.1f점 이다.", num,sum, (double)sum/num);
		
		
		
	}

}

// 5명
// 1 홍길동 90
// 2 장발장 78
// 3 홍길순 99
// 4 로미오 100
// 5 줄리엣 79
// 인간의 관점 - 점수를 전부 입력 받은 후 - 90+78+99+100+79
// 첫번째 값 입력 - 90 -> sum = 90
// 두번째 값 입력 - 78 -> sum = 90 + 78
// 세번째 값 입력 - 99 -> sum = 90 + 78 + 99
// 네번째 값 입력 - 100 -> sum = 90 + 78 + 99 + 100
// 다섯번째 값 입력 - 79 -> sum = 90 + 78 + 99 + 100 + 79

