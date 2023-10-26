import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int k = sc.nextInt();

            for (int j = I - 1; j < J; j++) {
                A[j] = k;
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
