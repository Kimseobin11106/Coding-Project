package chap_01;

public class _05_VariableNaming {
	public static void main(String[] args) {
//		변수 이름 짓는 법 
//		1. 저장할 값에 어울리는 이름 
//		2. 밑줄(_), 문자(ABC) , 숫자(123) 사용 가능 (공백 사용 불가)
//		3. 밑줄(_) 또는 문자(ABC)로 시작 가능 (즉, 숫자로 시작하는 변수명은 안됨)
//		4. 한 단어 또는 2개 이상의 단어의 연속 
//		5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
//		6. 예약어 사용 불가(PUBLIC STATIC VOID INT 연산자 등등)
		
//		입국 신고서
		String nationality = "대한민국"; // 국적 
		String firstName = "길동"; // 이름
		String lastName = "홍"; // 성 
		String dateOfBirth = "2001-12-05"; // 생년월일
		String residentialAddress = "신라 호텔"; // 거주지 
		String purposeOfVisit = "관광"; // 입국 목적 
		String flighNo = "KE657"; //항공편
		String _flightNo = "KE657"; 
		String flight_no_2 = "KE657";
//		String 3flight = "KE657"; 변수명은 숫자로 시작할 수 없다!
//		String -flightNo = "KE657"; 언더바를 제외한 특수문자로 변수명을 시작할 수 없다.
		
//		프로그램의 흐름을 위해 사용되는 경우 등(크게 변수 이름이 중요하지 않을 때)
		int i = 0;
		String s = "abc";
		String str = "Hello";
		
//		절대 변하지 않는 상수는 대문자로 쓴다.
		final String CODE = "KR";
		
	}
}