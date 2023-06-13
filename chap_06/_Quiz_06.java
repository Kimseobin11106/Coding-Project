package chap_06;

public class _Quiz_06 {
	
//	실행결과
//	이름 : 김**
//	주민등록번호 : 990130-1******
//	전화번호 : 010-1234-****
//	
//	substring() : 문자열 자르기
//	length() : 문자열 길이
	public static String getHiddenData(String data, int index) {
		String hiddenData = data.substring(0,index);
		for (int i = 0; i < data.length()-index; i++) {
			hiddenData += "*";
		}
		return hiddenData;
	}
	
	public static void main(String[] args) {
		String name = "김성일";
		String id = "990130-1234567";
		String phone = "010-1234-5678";
		
		System.out.println("이름 : " + getHiddenData(name, 1));
		System.out.println("주민등록번호 : " + getHiddenData(id, 8));
		System.out.println("전화번호 : " + getHiddenData(phone, 9));
		
	
	}

}
