import java.util.Scanner;

class Solution {
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();
				
				for (int tc = 1; tc <= T; tc++) {
						int N = sc.nextInt();
						
						char[] c = new char[N]; // 알파벳을 저장
						
						int[] k = new int[N]; // 숫자 저장
						
						for (int i = 0; i < N; i++) {
								c[i] = sc.next().charAt(0);
								k[i] = sc.nextInt();
						}
						
						int cnt = 0; 
						
						System.out.println("#" + tc);
						
						for (int i = 0; i < N; i++) {
								for (int j = 0; j < k[i]; j++) {
										System.out.print(c[i]);
										cnt++;
										if ( cnt == 10 ) {
												System.out.println();		
												cnt = 0;
										}
								}
						}
                    System.out.println();
				}
		}
}