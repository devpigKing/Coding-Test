import java.util.Scanner;

class Solution {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();

				for ( int tc = 1; tc <= T; tc++) {
						double sum = 0;
						
						for (int i = 0; i<10; i++) {
								int num = sc.nextInt();
								sum += num;
						}
						double avg = Math.round(sum/10);
						System.out.printf("#%d %d\n", tc, (int)avg);
				}

		}
}