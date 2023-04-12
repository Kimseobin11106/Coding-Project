package chap_02;

public class _03_Operator3 {
	
	public static void main(String[] args) {
		// 비교 연산자 ( > , < , >= , <= )
		// 정수 타입
		System.out.println(5 > 3); // 5는 3보다 크다. (참이면 true, 거짓이면 False)
		System.out.println(5 >= 3); // 5는 3보다 크거나 같다. true
		System.out.println(5 >= 7); // 5는 7보다 크거나 같다. false
		System.out.println(5 <= 3); // 5는 3보다 작거나 같다. false
		System.out.println(5 == 3); // 5는 3보다 같다. false
		
		System.out.println(5 == 5); // 5는 5와 같다. true
		System.out.println(5 == 3); // 5는 3와 같다. false
		System.out.println(5 != 5); // 5는 5와 다르다. false
		System.out.println(5 != 7); // 5는 7와 다르다 true
		
		// 참조형 데이터타입에서는 비교 연산자를 사용할 수 있을까?
		// 참조형은 ==와 !=만 사용할 수 있다. (같다 와 다르다)
		
		// 문자(char) 타입
		
		System.out.println('A' < 'B'); 
		// A는 아스키 코드값이 65이고 , B는 아스키 코드값이 66이기 때문에 , 65 < 66 식으로 변경해서 생각해보면 된다.
		System.out.println('0' == 0); 
		// '0'의 아스키코드값은 48 , 48 == 0
		
		//실수 타입
		
		System.out.println(10.0d == 10.0f); // 10.0d == 10.0f => 10.0d == 10.0d float은 기본형 double 로 바뀜
		System.out.println(0.1d == 0.1f); // 0.1d == 0.1f => 0.1d == 0.1d V V V
		
		System.out.println(0.1d);
		System.out.println(0.1f);
		
		System.out.println((double)0.1f); // float 을 double 로 형변환되면 소숫점 뒷 자리 값은 추가 될 수도 있다.
		
		
		
	}

}
