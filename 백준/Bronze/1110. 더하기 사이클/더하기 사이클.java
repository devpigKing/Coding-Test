import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int N2 = N;
        int cnt = 0;
        
        while (true) {
            N = ((N%10)*10) + (((N/10) + (N%10)) %10);
            cnt++;
            
            if(N2 == N) {
                break;
            }
        }
        System.out.println(cnt);
        
    }
}
