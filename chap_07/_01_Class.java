package chap_07;

public class _01_Class {
	
	public static void main(String[] args) {
//		C언어 - 인기있는 언어!! 대표적인 절차형 언어!!
//		Java, C++ , C# - 객체지향 언어!!
//		유지 보수성
//		높은 재사용성
		
//		차량용 블랙박스
//		모델명, 해상도, 가격, 색상
		
//		첫 번째 제품 
		String modelName = "까망이";
		String resolution = "FHD";
		int price = 20000;
		String color = "블랙";
		
//		두 번째 제품
		String modelName2 = "하양이";
		String resolution2 = "UHD";
		int price2 = 50000;
		String color2 = "화이트";
		
//		새로운 제품을 만든다면?
		BlackBox bbox = new BlackBox(); // 인스턴스화
//		BlacBox 클래스로부터 bbox 객체 생성
//		bbox 객체는 BlackBox 클래스의 인스턴스
		
		BlackBox bbox2 = new BlackBox();
		
	}

}
