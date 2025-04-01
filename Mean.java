import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생 수를 입력해주세요."); int student = sc.nextInt();

        int[] math = new int[student];
        int[] korean = new int[student];

        int sum = 0; // math
        int sum2 = 0; // korean

        for (int i=0; i<student; i++) {
            System.out.println(i+1 + "번 째 학생의" + "국어점수를 입력해주세요."); math[i] = sc.nextInt();
            sum += math[i];
        }

        for (int i=0; i<student; i++) {
            System.out.println(i+1 + "번 째 학생의" + "수학점수를 입력해주세요.");
            korean[i] = sc.nextInt();
            sum2 += korean[i];
        }

        System.out.println("수학평균은 " + sum/math.length + "입니다.");
        System.out.println("국어평균은 " + sum2/korean.length + "입니다.");
    }
}
