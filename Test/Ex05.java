package Test;

import java.util.Scanner;

public class Ex05 {
	
	// 1부터 100중의 랜덤한 수를 맞추는 게임
	// 예를 들어 cpu가 랜덤한 수를 뽑았는데 69로 가정하면
	// 플레이어가 50을 말하면, cpu UP이라고 응답
	// 플레이어가 70을 말하면, cpu DOWN 이라고 응답
	// 정답을 맞출 때 총 몇 번 시도했는지 출력하면 됨.
	public static void main(String[] args) {
		int ranNum = (int)(Math.random() * 100) + 1;
		
		// Math.random() : 0.0000000 ~ 0.99999999 중 발생
		// Math.random() * 100 : 0.00000000 ~ 99.999999 중 발생
		// (int)(Math.random() * 100) : 0 ~ 99 중 발생
		// (int)(Math.random() * 100) +1 : 1 ~ 100 중 발생
		
		int cnt = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
	do { // DoWhile : 최소 아래 문장을 실행 한번 보장하는 것 
		System.out.println("정답을 입력하세요!");
		num = sc.nextInt();
		cnt++;
		
		if (num > ranNum) {
			System.out.println("DOWN");
		} else if (num < ranNum) {
			System.out.println("UP");
		} else {
			System.out.println("정답! " + "총 " + cnt + "회 시도하셨습니다.");
			sc.close();
			break;
		}
		
	} while (num != ranNum);
	
	

  }
}	
