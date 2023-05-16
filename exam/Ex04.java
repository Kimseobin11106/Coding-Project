package exam;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요.");
		double height = sc.nextDouble();
		height = height / 100;
		
		System.out.println("몸무게를 입력하세요.");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("키 : " + height + ", 몸무게 : " + weight);
		System.out.printf("당신의 비만도수치 %.2f 인 당신은 ", bmi);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 24.9) {
			System.out.println("건강");
		} else if (bmi < 29.9) {
			System.out.println("과체중");
		} else if (bmi > 30) {
			System.out.println("비만");
		} else {
			System.out.println("오류");
		}
	}

}
