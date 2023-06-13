package chap_06;

public class _01_Method {
	
	// 메소드는 클래스내에 있는 함수이다.
	// 자바에서는 함수는 클래스에 내에서만 존재할 수 있다.
	// 그래서 자바에 한해서 함수를 메소드라고 부르기로 했다
	public static void main(String[] args) {
		System.out.println("메인입니다:!");
		
		// 메소드호출
		System.out.println("메소드 호출 전");
		hello();
		hello();
		hello();
		System.out.println("메소드 호출 후");
		
		
	}
	
	
	// 메소드 정의 static 메모리에 미리 적재해놓는 것 (메모리에 미리 저장 시켜서 빠르게 사용하는 것)
	public static void hello() {
		System.out.println("Hello World!");
	}
}
