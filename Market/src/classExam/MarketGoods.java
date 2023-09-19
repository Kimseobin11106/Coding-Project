package classExam;

public class MarketGoods {

    // 필드

    // 상수 (final) : 한번 값을 넣은 후 바뀌지 않는 수
    // public 으로 바꿔서 직접 접근이 가능해도 한번 지정하면 바뀌지 않기에 상관이 없음
    // final은 필드 값에만 줄 것, 인스턴스 화 하는 과정에서 사용하면 적용이 되지 않는다.
    public final String name;
    public final int retailPrice;
    private int discountRate;

    // 생성자
    public MarketGoods(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;

        // 예외 처리
        if (discountRate < 0 || discountRate > 60) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public MarketGoods(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
    }

    // Getter & Setter

//    상수를 사용하면 직접 접근이 가능하기에 Getter를 이용하지 않고도 사용 가능

//    public String getName() {
//        return name;
//    }
//
//    public int getRetailPrice() {
//        return retailPrice;
//    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    // Method
    public int getDiscountPrice() {
        return retailPrice * (100-discountRate) / 100;
    }
}


