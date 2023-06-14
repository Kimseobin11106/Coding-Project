package chap_07;

public class _04_Method {
	
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		b1.autoReport();
		BlackBox.canAutoReport = true;
		b1.autoReport();
		
		b1.insertMemoryCard(512);
		// 자동 충돌 감지 업데이트 완료
		BlackBox.canAutoReport = true;
		
	}

}
