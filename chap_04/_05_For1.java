package chap_04;

public class _05_For1 {
		
	public static void main(String[] args) {
			
			// 반복문 for
			// 성일 매장
			System.out.println("어서오세요. 성일매장입니다.");
			// 또 다른 손님이 들어온다면?
			System.out.println("어서오세요. 성일매장입니다.");
			System.out.println("어서오세요. 성일매장입니다.");
			System.out.println("어서오세요. 성일매장입니다.");
			// 만약에 인사말이 바뀌면?
			System.out.println("환영합니다. 성일매장입니다.");
			System.out.println("환영합니다. 성일매장입니다.");
			System.out.println("환영합니다. 성일매장입니다.");
			// 매장 이름이 바뀌면?
			// 성일 매장 - 소프트매장
			System.out.println("환영합니다. 소프트매장입니다.");
			System.out.println("환영합니다. 소프트매장입니다.");
			System.out.println("환영합니다. 소프트매장입니다.");
			
			// 코드가 만 줄이 넘는 상황이고, 모든 코드에 대해 단순히 수정을 하는 상황이라면?
			// 많은 시간이 걸리고, 단순한 작업으로 인한 집중력 저하로 실수가 발생할 수 있다.
			// 그래서 반복문이 필요하다!!
			
			// 반복문 사용 FOR
			/*
			for (초기화; 조건; 증감;) {
				반복 될 코드 
				
			} 
			*/
			// 1부터 10까지 - 배열
			for (int i=0; i<10; i++) {
				System.out.println(i+1);
			}
			
			for (int i=0; i<10; i++); {
				System.out.println("어서오세요. 성일매장입니다.");
				System.out.println("환영합니다. 성일매장입니다.");
				System.out.println("환영합니다. 소프트매장입니다.");
			}
			
			int j; // 바깥에서 지정하면 다음 for 안에서의 변수를 만들 수 없다.
			for (j=0; j<10; j++) {
				System.out.println(j);
			}
			// 1부터 10까지의 정수 중 짝수만 출력하시오.
			for (int i=0; i<=10; i++) {
				if (i%2!=0) {
					System.out.println(i+1);
				}		
			}
			
			for (int i=1; i<=10; i++) {
				if (i%2 == 0) {
					System.out.println(i);
				}
			}

			for (int i=2; i<=10; i += 2) {
				System.out.println(i);
			}
			
			// 거꾸로 10부터 1까지
			for (int i=10; i>0; i--) {
				System.out.println(i);
			}
			
			// 1부터 100까지의 합을 구하시오.
			int sum = 0;
			for (int i=1; i<=100; i++) {
				sum += i;
			}
			System.out.println("1부터 100까지의 합 : " + sum);
			
		}
	}
		
