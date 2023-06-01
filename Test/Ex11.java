package Test;

public class Ex11 {
	
	public static void main(String[] args) {
		
		// 1부터 10까지의 정수 중에서 랜덤으로 뽑기
		int range = 10;
		int start = 1;
		int a, b, c;
		int cnt = 0;
		
		// 0.0 ~ 0.9999999999
		// * 10 (range)
		// 0.0 ~ 9.9999999999 
		// + 1 (start)
		// 1.0 ~ 10.9999999999
		// int 정수형변환
		// 1 ~ 10
		while (true) {
		a = (int)(Math.random()*range+start);
		b = (int)(Math.random()*range+start);
		c = (int)(Math.random()*range+start);
		
		
		// 문제
		// 1부터 10까지의 정수를 랜덤으로 뽑아오는데 세 개의 수가 서로 겹치지 않도록 출력하기
		
		if (!(a == b || a == c || b == c)) {
			
			System.out.printf("%d, %d, %d" , a, b, c);
			System.out.printf(" 숫자가 겹친 횟수는 %d 회 입니다.", cnt);
			break;
			
		} else {
			System.out.println("이런 숫자가 겹쳤습니다! 다시 시도해주세요.");
			cnt++;
		}
		
		}
	}
}
