package chap_07;

public class _03_ClassVariables {
	
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
//		b1.canAutoReport = false;
		
		BlackBox b2 = new BlackBox();
		b2.modelName = "하양이";
//		b2.canAutoReport = false;
		
		// 특정 범위를 초과하는 출동 감지 시 자동신고 기능 개발 여부
		System.out.println(" == 개발 전 ==");
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
		
		// 기능 개발 완료
		System.out.println(" == 개발 후 ==");
//		b1.canAutoReport = true;
//		b2.canAutoReport = true;
		BlackBox.canAutoReport = true;
		
		System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
		System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
		
	}

}
