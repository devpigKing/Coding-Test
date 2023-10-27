import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for ( int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        double sum = 0;
        double max = A[0];

        for ( int ii = 0; ii < N; ii++) {
            if ( max < A[ii] ) {
                max = A[ii];
            }
            
            sum = sum + A[ii];
        }
        System.out.println(sum/max*100.0/N);
    }
}