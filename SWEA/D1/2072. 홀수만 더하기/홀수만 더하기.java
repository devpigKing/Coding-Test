import java.util.Scanner;

public class Solution {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();
				
				for (int tc=1; tc<=T; tc++) {
                    int result = 0;
                    for (int i=0; i<10; i++) {
                        int data = sc.nextInt();
                        if (data % 2 == 1) {
                            result += data;
                        }
                    }

                    System.out.printf("#%d %d\n", tc, result);
                }				

		}
}