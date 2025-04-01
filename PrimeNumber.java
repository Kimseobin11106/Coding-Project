public class PrimeNumber {
    public static void main(String[] args) {
        int cnt = 0;
        for (int n=2; n<=100; n++) {
            int i;
            for(i=2;i<n;i++) {
                cnt++;
                if(n%i == 0)
                    break;
            }
            if(n==i)
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + cnt);
    }
}
