package chap_07;

public class _06_ClassMethod {
	
	public static void main(String[] args) {
		BlackBox bbox = new BlackBox();
		bbox.modelName = "까망이";
		bbox.resolution = "FHD";
		bbox.price = 10000;
		bbox.color = "Black";
		
		// 자동신고기능 개발 전 
		// 클래스 필드는 클래스이름.필드로 접근 함.
		System.out.println(BlackBox.canAutoReport);
		
		bbox.autoReport();
		
		bbox.insertMemoryCard(512);
		
		// 1 : 일반영상 / 2 : 이벤트 영상 / 0 : 모든 영상
		int fileCount = bbox.getVideoFileCount(0);
		System.out.println(fileCount);
		
		// 클래스 메소드
		// 고객센터 연결
		BlackBox.callSeriviceCenter();
			
		
	}

}
