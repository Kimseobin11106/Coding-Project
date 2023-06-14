package chap_07;

public class BlackBox {
	
	// 클래스의 구성 요소 - 필드
	String modelName; // 모델명
	String resolution; // 해상도
	int price; // 가격
	String color; // 색상
	
//	boolean canAutoReport; // 자동신고가능
//	모든 객체에 공통적으로 필요한 변수는 클래스로 변수로 생성한다.
	static boolean canAutoReport = false;
	
	// 자동 충돌 감지 기능 여부 안내
	void autoReport() {
		if (canAutoReport) {
			System.out.println("충돌 감지 기능이 활성화 되었습니다.");
		} else {
			System.out.println("충돌 감지 기능이 활성화 되지 않았습니다.");
		}
	}
	
	// 메모리카드 삽입 기능
	void insertMemoryCard(int capacity) {
		System.out.println("메모리 카드가 삽입되었습니다.");
		System.out.println("용량은 " + capacity + " GB 입니다.");
	}
	

}
