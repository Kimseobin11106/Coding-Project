package chap_04;

import java.util.Scanner;

public class _12_BreakContinue {
	
	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in); // 콘솔 창에 입력을 받는 것 
		
		while (true) {
			System.out.println("(1) square"); // 제곱미터
			System.out.println("(2) square root"); // 제곱근
			System.out.println("(3) log"); // 로그
			System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp); // 참조형 데이터를 바꿀 때 (int)를 앞에 붙이는 것으로 형변환 하는 것은 불가능 하다. Integer.parse 를 사용하라
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; // 반복문을 빠져 나올 때 사용하는 것
			} else if(!(1<= menu && menu <= 3)){ // 1부터 3이 아닐 때, 조건을 부정 처리 할때 != 말고도 괄호 하고 밖에 ! 처리 해줘도 된다.
				System.out.println("메뉴를 잘못 선택하였습니다. (종료는 0)");
				continue; // 아래 쪽 코드를 실행 하지 않고, 위로 다시 돌아가서 코드를 실행하는 것
			}
		
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
			
			
			
			
		}
		
		sc.close();
	}
}
