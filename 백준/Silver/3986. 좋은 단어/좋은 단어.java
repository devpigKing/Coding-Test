import java.io.*;
import java.util.Stack;

public class Main {
		static int cnt;
		public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				int N = Integer.parseInt(br.readLine());
				cnt = 0;
				for (int i = 0; i < N; i++) {
						String a = br.readLine();
						niceWord(a);
				}
				System.out.println(cnt);
				
		}


		static void niceWord(String a) {
				if (a.length()%2 == 1) return; // 문자열 길이가 홀수라면 짝이 안생겨 패스
	
				Stack<Character> stack = new Stack<>();
				stack.push(a.charAt(0));
				for (int i = 1; i < a.length(); i++) {
						if (stack.size() > 0 && stack.peek() == a.charAt(i)) {
								stack.pop();
						} else {
								stack.push(a.charAt(i));
						}	
				}
				if (stack.isEmpty()) cnt++;
				


		}
}