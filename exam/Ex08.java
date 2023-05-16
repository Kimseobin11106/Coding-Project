package exam;

import java.util.Scanner;

public class Ex08 {
// 1부터 시작하여, 3과 6과 9에서 박수를 치는 3, 6, 9 게임을 할려고 한다.
// 40번까지 진행을 하였을 때 총 몇 번의 박수를 쳤는지 구하시오.
// (예를 들어 13은 박수 한 번 "짝" 이며, 33, 36, 39는 박수 두번 "짝짝"이다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;
		
		for (int i=1; i <=num; i++) {
			int q = i / 10;
			int r = i % 10;
			
			if (q == 3 || q == 6 || q == 9) {
				if (r == 3 || r == 6 || r == 9) {
					System.out.print("짝");
					cnt++;
				}
				System.out.println("짝");
				cnt++;
			} else {
				if (r == 3 || r == 6 || r == 9) {
					System.out.println("짝");
					cnt++;
				} else {
					System.out.println(i);
				}
			}
		}
		System.out.println("총 박수친 횟수는 " + cnt);
		
	}

}
