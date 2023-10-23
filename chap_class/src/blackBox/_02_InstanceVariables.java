package blackBox;

public class _02_InstanceVariables {
    public static void main(String[] args) {

        // 인스턴스화
        BlackBox b1 = new BlackBox();

        // 인스턴스 변수
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "black";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        BlackBox b2 = new BlackBox();

        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "white";
    }
}
