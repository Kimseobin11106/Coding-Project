import java.util.Scanner;

public class Median {

    static int med3(int a, int b, int c) {


        if (a > b && a < c || a < b && a > c)  {
            return a;
        } else if (b > a && b < c || b < a && b > c)  {
            return b;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 값을 입력하세요.");
        int a,b,c;

        System.out.println("a:");
        a = sc.nextInt();
        System.out.println("b:");
        b = sc.nextInt();
        System.out.println("c:");
        c = sc.nextInt();

        System.out.println("중앙값은 " + med3(a,b,c) + " 입니다.");



    }
}

