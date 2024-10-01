import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution {
		public static void main(String args[]) throws IOException {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer st;
				StringBuilder sb = new StringBuilder();
				
				int T = Integer.parseInt(br.readLine());
				
				for (int i = 1; i <= T; i++) {
						int N = Integer.parseInt(br.readLine());
						int[] arr = new int[N];
						
						st = new StringTokenizer(br.readLine(), " ");
						
						for (int j = 0; j < N; j++) {
								int num = Integer.parseInt(st.nextToken());
								arr[j] = num;
						}
						
						long profit = 0;
						int max = 0;
						
						for (int k = N-1; k >= 0; k--) {
								int today = arr[k];
								if ( max > today ) {
										profit += max - today;
								} else {
										max = today;
								}
						}
						
						sb.append("#" + i + " " +profit + "\n");
				}
				
				System.out.println(sb);
		}
}