package classExam;

public class MarketGoods {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGoods(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = discountRate;
    }

    public MarketGoods(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
    public int getDiscountPrice() {
        return retailPrice * (100-discountRate) / 100;
    }
}


