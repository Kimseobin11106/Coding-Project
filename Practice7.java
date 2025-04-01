class Gaus {
    static int sum2(int a) {
        int sum = 0;
        sum = (1 + a) * (a / 2);

        return sum;
    }
}

public class Practice7 {
    public static void main(String[] args) {

        System.out.println(Gaus.sum2(10));
        System.out.println(Gaus.sum2(50));
    }
}
