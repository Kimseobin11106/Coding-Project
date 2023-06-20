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

	int getVideoFileCount(int type) {
		if (type == 1) { // 일반 영상
			return 9;
		} else if (type == 2) { // 이벤트 영상
			return 2;
		}
		return 10;
	}
	
	// ShowDateTime : 날짜정보 표시 여부
	// ShowSpeed : 속도정보 표시 여부
	// min : 영상 기록 단위(분)
	void record(boolean showDateTime, boolean showSpeed, int min) {
		System.out.println("녹화를 시작합니다.");
		if (showDateTime) {
			System.out.println("영상에 날짜/시간 정보가 표시됩니다.");
		}
		if (showSpeed) {
			System.out.println("영상에 속도 정보가 표시됩니다.");
		}
		System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
	}

	// 사용자가 조작하지 않은 기본상태는 모두 활성화되고 5분 간격으로 녹화를 한다.
	// Overloading 오버로딩
	void record(int min) {
		record(true, true, min);
	}
	
	void record() {
		record(true, true, 5);
	}
		
}
