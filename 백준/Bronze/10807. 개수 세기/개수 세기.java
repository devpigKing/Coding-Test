import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] M = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            M[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if ( v == M[i]) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}