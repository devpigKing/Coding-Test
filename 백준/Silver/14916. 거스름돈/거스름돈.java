import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너를 통해 n을 입력 받고
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0; // 동전의 갯수를 센다.

        while (n >= 0) { // 금액이 0보다 작거때까지
            if (n %5 == 0) {
                cnt += n/5;
                System.out.println(cnt);
                break;
            }

            n -= 2;
            cnt++;

        }
        if ( n < 0) {
            System.out.println(-1);
        }
    }
}
