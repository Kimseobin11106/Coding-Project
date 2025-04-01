import java.util.Scanner;

class Max1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }
}


public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("네 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : ");
        a = sc.nextInt();
        System.out.println("b의 값 : ");
        b = sc.nextInt();
        System.out.println("c의 값 : ");
        c = sc.nextInt();
        System.out.println("d의 값 : ");
        d = sc.nextInt();

        System.out.println("최댓값은 " + Max1.max4(a, b, c, d));
    }
}
