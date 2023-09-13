package classExam;

public class MarketMain {

    public static void main(String[] args) {

//     생성자를 통해 인스턴스 변수의 값을 초기화
       MarketGoods g1 = new MarketGoods("Macbook Air",1950000);
       MarketGoods g2 = new MarketGoods("Macbook Pro",2950000,15);
       MarketGoods g3 = new MarketGoods("iPhone14",920000,20);

//     할인율과 가격 확인
       System.out.println(g1.name + "의 할인율: " + g1.getDiscountRate() + "%");
       System.out.println(g2.name + "의 할인율: " + g2.getDiscountRate() + "%");
       System.out.println(g3.name + "의 할인율: " + g3.getDiscountRate() + "%");

       System.out.println(g3.name + "의 정상가격 : " + g3.retailPrice + "원");
       System.out.println(g3.name + "의 할인가격 : " + g3.getDiscountPrice() + "원");

//     할인율 변경
       System.out.println("경쟁 업체가 많아져서 " + g3.name + "의 할인율이 35%로 올랐습니다.");
       g3.setDiscountRate(35);
       System.out.println(g3.name + "의 할인가격 : " + g3.getDiscountPrice() + "원");
    }

}
