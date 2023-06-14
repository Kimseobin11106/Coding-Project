package chap_07;

// 인스턴스 변수
public class _02_InstanceVariabels {
	
	public static void main(String[] args) {
		
		// 첫 제품
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		b1.resolution = "FHD";
		b1.price = 20000;
		b1.color = "Black";
		
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		// 두 번째 제품
		BlackBox b2 = new BlackBox();
		b2.modelName = "하양이";
		b2.resolution = "UHD";
		b2.price = 50000;
		b2.color = "white";
		
		System.out.println(b2.modelName);
		
		
	}
	
	

}
