package chap_04;

public class _06_While {
	
	public static void main(String[] args) {
		// 반복문 While
		// 수영장에서 수영을 하는 모습
		int distance = 25; // 전체 거리 25m
		int move = 0; // 전체 이동 거리 0m
		/*
		 * while(조건식) {
		 * 		반복 될 코드!!
		 * 		증감포함(단, 무한루프를 의도적으로 돌릴때는 제외)
		 * }
		 * 
		 */
		int count = 0;
		while (move < distance) {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3; // 3미터 이동
			count++;
		}
		System.out.println("도착!!");
		System.out.println(count + "초에 도착!!");
		
		// 무한루프
		move = 0;
		while (move < distance) {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3;
			if (move == 15) {
				break;
			}
		}
			
	}
}
