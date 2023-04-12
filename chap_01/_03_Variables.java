package chap_01;

public class _03_Variables {
	
	public static void main(String[] args) {
		// 변수의 선언과 할당
		// 변수타입 변수명 = 값;
		String name = "홍길동";
		int hour = 15;
		
		System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");
		
		double score = 91.5;
		char grade = 'A';
		name = "유재석";
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println("귀하의 학점은 " + grade + "입니다.");
		
		boolean pass = true;
		System.out.println(name + "님은 이번 시험에 합격했을가요?" + pass);
		
		double d = 3.1579151567;
		float f = 3.1579151567f; // float 4Bytes double 8Bytes float 실수 뒤에 f를 붙일시 4Bytes의 값만 출력 f 꼭 붙이기
		
		// int i = 10000000000; error
		long l = 10000000000l; // int 4 long 8 뒤에 l
		long l3 = 1_000_000_000_000L; // 변수 값 중 띄어쓰기 _로 표시 
		
		byte b = 120; // 굳이 안붙여도 됨 byte 의 b나 short s 
		short s = 230; // 굳이 안붙여도 됨
		
	}	
}
