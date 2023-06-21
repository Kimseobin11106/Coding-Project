package chap_07;

public class BlackBox {
	
	// 클래스의 구성 요소 - 필드, 생성자, 메소드
	
	// 필드
	// 인스턴스 필드 - 각 개체 안에서 사용되는 필드 private
	String modelName; // 모델명
	String resolution; // 해상도
	int price; // 가격
	String color; // 색상
	
	// 생성자 
	// 아래와 같이 빈 코드를 갖는 생성자를 기본생성자라고 함.
	// 개발자가 생성자를 따로 쓰지 않은 경우에는 자바가 자동으로 기본생성자를 생성해 줌.
//	public void BlackBoxExample() {}
	
	// 메소드
	// 기능을 담당!
	// 클래스 
	// 인스턴스 메소드 - 해당 객체에서만 사용할 수 있는 메소드!
//	void autoReportExample() { // 파라미터 X, 리턴 값 X
//		if (canAutoReport) {
//			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
//		} else {
//			System.out.println("자동 신고 기능이 지원되지 않습니다.");
//		}
//	}
	
//	void insertMemoryCardExample(int capacity) { // 파라미터 O, 리턴 값 X
//		System.out.println("메모리 카드가 삽입 되었습니다");
//		System.out.println("용량은 " + capacity + "GB 입니다.");
//	}
	
//	int getVideoFileCountExample(int type){ // 파라미터 O, 리턴 값 O
//		if (type == 1) { // 일반영상
//			return 9;
//		} else if (type == 2) { // 이벤트 영상
//			return 2;
//		} else {
//			return 11;
//		}
//	}
	
// 	ShowDateTime : 날짜정보 표시 여부
// 	ShowSpeed : 속도정보 표시 여부
// 	min : 영상 기록 단위(분)
//  
//	void recordExample(boolean showDateTime, boolean showSpeed, int min, String example) {
//	  System.out.println("녹화를 시작합니다.");
//	  if (showDateTime) {
//		  System.out.println("영상에 날짜/시간 정보가 표시됩니다.");
//	  }
//	  if (showSpeed) {
//		  System.out.println("영상에 속도 정보가 표시됩니다.");
//	  }
//	  System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
//  }
//
//		// 사용자가 조작하지 않은 기본상태는 모두 활성화되고 5분 간격으로 녹화를 한다.
//		// Overloading 오버로딩 : 파라미터의 갯수가 다름
//		void recordExample(int min) {
//			record(true, true, min);
//		}
//		
//		void recordExample() {
//			record(true, true, 5);
//		}
	
	
	//	boolean canAutoReport; // 자동신고기능
	//	모든 객체에 공통적으로 필요한 변수는 클래스로 변수로 생성한다.
	// 클래스 필드 - 모든 객체에 공통적으로 적용하는 필드
	
	static boolean canAutoReport = true;
	
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
	
	static void callSeriviceCenter() {
		System.out.println("서비스센터(1588-000)으로 연결합니다.");
	}
	
	
		
}
