import java.util.Scanner;

class Solution {
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();
				
				for (int tc = 1; tc <= T; tc++) {
						int N = sc.nextInt();
						String text = sc.next();
						String check = sc.next();
						int cnt = 0;
						
						for (int i = 0; i < text.length(); i++) {
								if (text.charAt(i) == check.charAt(i)) cnt++;
						}
						System.out.println("#" + tc + " " + cnt);
				}
		}
}