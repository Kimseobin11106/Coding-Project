// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
// 2 * 1 = 2
// 2 * 2 = 4
// 3 * 1 = 3
// 3 * 2 = 6
// 3 * 3 = 9
package chap_04;

public class _Ex_02 {
	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				if (j>i) break;
				System.out.println(i + " * " +j+ " = " +(i*j));
			}
		}
	}
	

}
