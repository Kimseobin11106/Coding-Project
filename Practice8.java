class Sum2 {
    static int sumof(int a, int b) {
        int sum = 0;
        int max,min;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}

public class Practice8 {
    public static void main(String[] args) {
        System.out.println(Sum2.sumof(3,5));
        System.out.println(Sum2.sumof(6,4));
    }
}
