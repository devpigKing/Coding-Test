import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Solution {

		public static void main(String[] args) throws IOException {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer st;
				StringBuilder sb = new StringBuilder();
				
				int T = Integer.parseInt(br.readLine());
				
				for (int i = 0; i < T; i++) {
						st = new StringTokenizer(br.readLine(), " ");
						int A = Integer.parseInt(st.nextToken());
						int B = Integer.parseInt(st.nextToken());
						int N = Integer.parseInt(st.nextToken());
						
						int cnt = 0;
						
						if ( A < B ) {
								int temp = A;
								A = B;
								B = temp; 
						}
						
						while ( A <= N && B <= N) {
								if ( A > B ) {
										B += A;
								} else {
										A += B;
								}
								cnt++;
							
						}
						sb.append(cnt).append("\n"); // 각 테스트 케이스의 결과를 저장
				}
				System.out.print(sb);
		}
}