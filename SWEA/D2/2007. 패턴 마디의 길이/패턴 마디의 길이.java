import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution {
		public static void main(String args[]) throws IOException {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
				
				for (int tc = 1; tc <= T; tc++) {
						String text = br.readLine();
						for (int i = 1; i <= text.length(); i++) {
								String pattern = text.substring(0, i); // 3. 패턴 설정
								String tmp = text.substring(i, i+i); // 패턴과 같은 문자열 확인
								
								
								if (pattern.equals(tmp)) {
										System.out.println("#" + tc + " " + pattern.length());
                                    break;
								}
						}
				}
				
		}
}