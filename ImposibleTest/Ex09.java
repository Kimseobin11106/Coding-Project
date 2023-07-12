package ImposibleTest;

import java.util.Scanner;

public class Ex09 {
	
	// 직사각형의 넓이 구하기(메소드 이용)
	// main에서 area 메소드 호출 
	// area 메소드는 가로와 세로의 길이를 파라미터로 받아서
	// 넓이값을 리턴해주는 메소드이다.
	static int area(int horizontal,int vertical) {
		return (horizontal * vertical);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로는?");
		int h = sc.nextInt();
		
		System.out.println("세로는?");
		int v = sc.nextInt();
		
		System.out.println(area(h,v));
	}

}
