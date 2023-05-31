package chap_04;

public class _13_NameLoop {
	
	public static void main(String[] args) {
		
		Loop1: // continue 나 break 의 경우를 이중 for문에서 가장 바깥에 있는 for 문과 같이 쓰고 싶다면 이름을 사용
		for (int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5) continue Loop1;
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
}
