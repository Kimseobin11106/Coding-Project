import java.util.Scanner;

class Min2 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }
}

public class Practice3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("네 정수의 최솟값을 구합니다.");
        System.out.println("a의 값 : ");
        a = sc.nextInt();
        System.out.println("b의 값 : ");
        b = sc.nextInt();
        System.out.println("c의 값 : ");
        c = sc.nextInt();
        System.out.println("d의 값 : ");
        d = sc.nextInt();

        System.out.println("최소값은 " + Min2.min4(a, b, c, d));
    }
}
