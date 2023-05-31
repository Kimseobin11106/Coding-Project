package chap_04;

import java.util.Scanner;

public class _14_NameLoopEx {
	
	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택 하세요. (종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			// menu = sc.nextInt();
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1<=menu && menu<=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			
			for (;;) { // for 문의 무한루프는 ;;
				System.out.println("계산할 값을 입력하세요. (계산종료: 0 , 전체종료: 99)>");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if (num == 0) {
					break;
				}
				if (num == 99) {
					break outer; // outer 값으로 나와서 break 
				}
				
				switch (menu) {
					case 1:
						System.out.println("result=" + num*num);
						break;
					case 2:
						System.out.println("result=" + Math.sqrt(num)); // Math 수학 공식 정리 함수 sqrt 제곱근
						break;
					case 3:
						System.out.println("result=" + Math.log(num)); // Log 로그 
						break;
				}
				
			}
		}
	}
}
