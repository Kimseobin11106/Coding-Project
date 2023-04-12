package chap_01;

public class _02_DataTypes {
	public static void main(String[] args) {
		System.out.println("Hello World"); // 문자열
		System.out.println("안녕하세요?"); // 문자열
		System.out.println(12); // 정수형(int)
		System.out.println(-34); // 정수형(int)
		System.out.println(3.14); // 실수형 double
		System.out.println('a'); // 문자형 
		System.out.println(true); // boolean
		System.out.println(false); // boolean 
		
		System.out.println("7" + 7); // 문자열 + 정수형 -> 문자열 (77)
		System.out.println('7' + 7); // 62(문자 7의 아스키코드값이 55기 때문에 55+7 == 62)
		System.out.println('a'+ 5); // 102 문자 a의 아스키코드값 97 <<
		System.out.println("7" + 7 + 7);
		System.out.println(7 + 7 + "7");
	}	

}
