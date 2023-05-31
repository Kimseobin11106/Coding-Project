package chap_04;

public class _07_DoWhile {
	
	public static void main(String[] args) {
		// 반복문 do~while
		// 최소 한 번은 무조건 실행시키는 반복문
		
		int distance = 25;
		int move = 25;
		while (move < distance) {
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3;
		}
		System.out.println("while 종료");
		do { // do는 최소 아랫 문장을 한번은 실행 보장을 함 
			System.out.println("스트로크를 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3;
		
		} while (move < distance); 
		System.out.println("do~while 종료");
	}
}
