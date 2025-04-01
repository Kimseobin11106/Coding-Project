import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a, int ind1, int ind2) {
        int temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 크기를 입력하세요: ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] 값 입력: ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("반전된 배열:");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
