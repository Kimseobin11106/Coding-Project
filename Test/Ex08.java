package Test;

public class Ex08 {
	
	// 주사위 2개를 던져서 합이 6이 되는 경우를 모두 출력하시오.
	// 주사위 3개를 던져서 합이 10이 되는 경우를 모두 출력하시오.
	public static void main(String[] args) {
		int cnt = 0;
		int cnt2 = 0;
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				if (i+j == 6) {
					cnt++;
					System.out.println(i + "+" + j + "=" + 6 + " 횟수 : " + cnt);
				}
			}
		}
		
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				for (int k=1; k<=6; k++) {
				if (i+j+k == 10) {
					cnt2++;
					System.out.println(i + "+" + j + "+" + k + "=" + 10 + " 횟수 : " + cnt2);
				}
			}
		}
		
		} System.out.println(cnt + " ," + cnt2);

	}
}

