import java.util.Scanner;

class Solution {
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();
				
				for (int tc = 1; tc <= T; tc++) {
						int A = sc.nextInt();
						int B = sc.nextInt();
						int C = sc.nextInt();
						
						int ans = 0;
						
						if ( A <= B ) {
								ans = (C/A);
						} else {
								ans = (C/B);
						}
						System.out.println("#" + tc + " " + ans);
				}
				
		}
}