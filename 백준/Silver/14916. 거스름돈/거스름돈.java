import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 2원과 5원 동전을 사용하여 만들 수 있는 경우의 수 계산
        int count = 0;
        while (n >= 0) {
            if (n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                return;
            }
            n -= 2;
            count++;
        }

        // 만들 수 없는 경우
        System.out.println(-1);
    }
}