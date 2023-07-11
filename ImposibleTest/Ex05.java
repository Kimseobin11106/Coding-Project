package ImposibleTest;

import java.util.Scanner;

public class Ex05 {
	
	// up & down
	// 1부터 100까지의 정수 중의 랜덤으로 수를 부여받음. Math.random() (double 형태) 
	// 예를 들어 랜덤의 수가 71이라고 가정하면,
	// 플레이어가 50을 말하면, UP 이라고 응답을 해주고,
	// 플레이어가 80을 말하면, DOWN 이라고 응답을 해준다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranNum = (int)(Math.random()*100) + 1;
		int guess;
		int cnt = 0;
		
		do { // 횟수는 0일 수 없으니 한번은 실행되게 do while 문을 사용한다.
			System.out.println("정답을 추측하세요.");
			guess = sc.nextInt();
			cnt++;
			if (guess > ranNum) {
				System.out.println("Down");
			} else if (guess < ranNum) {
				System.out.println("UP");
			}
		} while (guess != ranNum);
		
		System.out.println("총 횟수는 : " + cnt + " 축하드립니다.");
		
	}

}
