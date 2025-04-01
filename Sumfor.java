import java.util.Scanner;

class Sum {
    static int suma(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        return sum;
    }
}

public class Sumfor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 몇까지의 합 구하실 "); int ans = sc.nextInt();

        System.out.println("1부터 "+ ans + "까지의 합은 " + Sum.suma(ans));
        System.out.println(Sum.suma(8));
    }
}
