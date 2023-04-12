package chap_01;

public class _07_TypeCasting {
	public static void main(String[] args) {
//		-2^7 ~ 2^7
//		-128 ~ 127 -128 ~ 0 ~ 127 오버플로우
//		byte b = 126; 
//		System.out.println(b); // 126
//		b++;
//		System.out.println(b); // 127 
//		b++;
//		System.out.println(b); // - 128 
		
		
		// 형변환 (Casting) 중요!!
		// 정수형 실수형으로 변환
		// 실수형 정수형으로 변환
		// int to float, double 
		int score = 93; // int 형 변수 
		System.out.println(score); // 93 
		System.out.println((float)score); // 93.0 소숫점 아래 0이 나옴
		System.out.println((double)score); // 93.0 동일 
		
		// float, double to int 
		float score_f = 93.3f;
		double score_d = 98.8;
		System.out.println((int)score_f); // 93 소숫점 아래 숫자가 버려진다 
		System.out.println((int)score_d); // 98 동일 
		
		// 정수 + 실수 연산 
		score = 93 + (int)98.8; // (int)를 붙여 정수로 바꾸기
		System.out.println(score); // 93 + 98 = 191
		
		score_d = 93 + 98.8; // (double)을 생략할 수 있다.
		
		// 변수에 형변환된 데이터 집어넣기
		double convertedScoreDouble = score; // 191 -> 191.0 으로 저장 
		// int -> long -> float -> double (자동 형변환) : 굳이 앞에다가 무엇을 써주지 않아도 자바에서 지원해주는 형변환
		
		// int convertedScoreInt = score_d; 191.8 -> 191 오류 
		// double -> float -> long -> int (수동 형변환) 
		
	}	
}
