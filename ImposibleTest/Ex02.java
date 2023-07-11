package ImposibleTest;

import java.util.Scanner;

public class Ex02 {
	
	// 총 학생의 수를 입력받음
	// 해당 학생들의 성적을 입력받아 총점과 평균을 구하시오
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 학생의 수를 입력해주세요.");
		int students = sc.nextInt();
		int score;
		int sum = 0;
		
		for (int i = 0; i<students; i++) {
			System.out.println("학생들의 성적을 입력해주세요.");
			score = sc.nextInt();
			sum += score;
		}
		
		System.out.printf("총 %d명의 학생의 총점은 %d좀 이고, 평균은 %.1f점이다.", students, sum, (double)sum/students);
		
	}

}
