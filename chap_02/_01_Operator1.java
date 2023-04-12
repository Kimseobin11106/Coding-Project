package chap_02;

public class _01_Operator1 {
	
	public static void main(String[] args) {
		// 산술 연산 - 이항 연산
		System.out.println(4 + 2);
		System.out.println(4 - 2);
		System.out.println(4 * 2);
		System.out.println(4 / 2);
		System.out.println(5 % 2);
		System.out.println(8 % 3);
		System.out.println(8 % -3); // 나머지 연산 할때 앞에 나누는 값이 양수면 그대로 양수로 나머지 구하기
		System.out.println(-8 % 3); // 음수는 음수로 값 출력 
		System.out.println(-8 % -3);
		
		
		// 우선 순위 연산
		System.out.println(2 + 2 * 2); 
		System.out.println((2 + 2) * 2);
		
		// 변수를 이용한 연산 
		int num1 = 20;
		int num2 = 10;
		int result;
		
		result = num1 + num2;
		System.out.println(result); // 20 + 10 = 30
		
		result = num1 - num2;
		System.out.println(result); // 20 - 10 = 10 
		
		result = num1 * num2;
		System.out.println(result); // 20 * 10 = 200
		
		result = num1 / num2;
		System.out.println(result); // 20 / 10 = 2
		
		result = num1 % num2;
		System.out.println(result); // 20 % 10 = 0
		
		// Operator Important Keyword 
		// 증감 연산 ++ , -- 
		System.out.println("=========");
		int val; 
		val = 10;
		System.out.println(val); // 10
		System.out.println(val++); // 10 : 문장이 실행된 후 추가
		System.out.println(val); // 11 
		
		val = 10;
		System.out.println(val); // 10 
		System.out.println(++val); // 11 : 문장이 실행되기 전 추가 
		System.out.println(val); // 11
		
//		증감 연산자 위치에 따라 두 가지 유형으로 분류
//		증가연산자(++) : 피연산자의 값을 1 증가시킨다.
//		감소연산자(--) : 피연산자의 값을 1 감소시킨다.
//		전위형 / j=++i; / 값이 참조되기 전에 증가를 시킨다.
//		후위형 / j=i++ / 값이 참조된 후에 증가 시킨다.
//		ex) for (int i=0; i<10; i++) {
//		
//		}
		
		val = 10;
		System.out.println(val); // 10 
		System.out.println(--val); // 9 :  해당문장 실행 전에 1을 증가시킨 후 문장을 실행해라.
		
		val = 10;
		System.out.println(val); // 10
		System.out.println(val--); // 10 : 해당문장 실행 후 1을 증가시켜라. 
		System.out.println(val); // 9
		
		// 은행 대기번호 표 
		int waiting = 0;
		System.out.println("대기 인원 : " + waiting++); // 0 
		System.out.println("대기 인원 : " + waiting++); // 1
		System.out.println("대기 인원 : " + waiting++); // 2
		System.out.println("총 대기 인원 : " + waiting); // 3
		
		
	}

}
