package blackBox;

public class _09_GetterSetter {
    public static void main(String[] args) {
        // instance
        BlackBox b1 = new BlackBox();

        b1.modelName = "까망이";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인 행사 오류
        b1.price = -50000;
        System.out.println("가격 : "  + b1.price + "원");

        // 고객 문의 중 할당 값 오류
        System.out.println("해상도 : " + b1.resolution);

        BlackBox b2 = new BlackBox();

        // Setter
        b2.setModelName("하양이");
        b2.setPrice(-50000);
        b2.setColor("흰색");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());


        // 직접 접근
        b2.price = -50000;

        System.out.println("가격 : " + b2.getPrice() + "원");


    }
}
