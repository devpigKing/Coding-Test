import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Basket = sc.nextInt();
        int M = sc.nextInt(); //  공 체인지 횟수

        int A[] = new int[Basket+1];

        for (int i = 1; i <= Basket; i++) {
            A[i] = i;
        }

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
        
        for ( int i = 1; i <= Basket; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
