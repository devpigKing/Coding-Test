import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] M = new boolean[31];

        for ( int i = 0; i< 28; i++ ) {
            int pass = sc.nextInt();
            M[pass] = true;
        }
        for( int i = 1; i<=30; i++) {
            if(!M[i]) {
                System.out.println(i);
            }
        }
    }
}

