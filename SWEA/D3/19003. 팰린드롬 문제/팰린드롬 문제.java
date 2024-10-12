import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Solution {
		public static void main(String[] args) throws IOException {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int T = Integer.parseInt(br.readLine());
				
				for (int tc = 1; tc <= T; tc++) {
						StringTokenizer st = new StringTokenizer(br.readLine());
						int N = Integer.parseInt(st.nextToken());
						int M = Integer.parseInt(st.nextToken());
						
						int result = 0; // 최종 팰린드롬 길이 변수
						boolean check = false; // 중앙에 올 수 있는 팰린드롬 처리 여부
						Set<String> set = new HashSet<>();		// 역순 문자열을 저장하기 위한 set(set은 순서가 없으므로)
						for (int i = 0; i < N; i++) {
								String text = br.readLine();
								if (set.contains(text)) {
										result += M*2;
								} else {
										if (!check && palindrom(text)) {
												check = true;
												result += M;
										} else {
												StringBuilder sb = new StringBuilder(text);
												set.add(sb.reverse().toString());
										}
								}
						}
						System.out.println("#" + tc + " " + result);
				}
				
		}
		
		static boolean palindrom(String str) {
				for (int i = 0; i < str.length()/2; i++) {
						if (str.charAt(i) != str.charAt(str.length() - 1 - i )) {
								return false;
						}
				}
				return true;
		}
}