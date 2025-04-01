import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxof(int[] a) {
        // 배열을 a, 배열의 최대값 구하는 함수
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("사람수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];


        System.out.println("키 값은 다음과 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = rand.nextInt(90);
            System.out.println(height[i]);
        }


        System.out.println("최대값은 " + maxof(height) + "입니다.");
    }
}
