package chap_02;

public class _05_Operator5 {
	
	public static void main(String[] args) {
		// 삼항 연산자
		// 결과 = (조건) ? (참일 경우 결과 값) : (거짓일 경우 결과 값) 조건에 따라서 true/false 결과 값을 입력한 것이 출력 됨
		int x = 3;
		int y = 5;
		int max = (x > y) ? x : y; // (3 > 5) ? max = 3 : max = 5 
		System.out.println(max); // 5  
		
		int min = (x < y) ? x : y;
		System.out.println(min); // 3
		
		boolean b = (x == y) ? true : false; // (3 == 5) ? true : false
		System.out.println(b);
		
		String s = (x != y) ? "다르다" : "같다";
		System.out.println(s);
		
		int num = -10;
		// 삼항 연산자를 num 값이 음수 양수 상관없이 절대값을 계산해서 absNum에 넣으시오.
		int absNum = (0 <= num) ? num : -num; 
		// num 이 0보다 크거나 같다 == 양수거나 0이다. 그러면 참일때는 바로 출력해주고 거짓이면 음수니까 -를 곱해줘서 출력(-num)하면 절대값으로 계산된다.
		System.out.println(absNum);
	}

}
