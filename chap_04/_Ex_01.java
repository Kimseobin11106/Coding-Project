// 구구단을 짝수 단만 출력 (2,4,6,8)

package chap_04;

public class _Ex_01 {
	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {
			if (i%2!=0) continue;
			for (int j=1; j<=9; j++) {
				j += 1;
				System.out.println(i + " * " +j+ " = " +(i*j));
			}
		}
	}

}
