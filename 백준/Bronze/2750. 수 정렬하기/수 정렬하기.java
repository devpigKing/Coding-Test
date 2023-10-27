import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for ( int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for ( int i = 0; i < N-1; i++) {
            for ( int j = i+1; j < N; j++) {
                if ( A[i] > A[j] ) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }

        for ( int i = 0; i < A.length; i++ ) {
            System.out.println(A[i]);
        }
    }
}
