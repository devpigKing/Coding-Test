import java.util.Scanner;

class Solution {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();

				for (int tc = 1; tc <= T; tc++) {
						int max = 0;
						for ( int i = 0; i < 10; i++) {
								int num = sc.nextInt();
								if ( max < num ) {
										max = num;
								}
						}
						System.out.println("#" + tc + " " + max);
				}
		}
}