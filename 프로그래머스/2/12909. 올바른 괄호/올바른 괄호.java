import java.util.ArrayDeque;

class Solution {
		public boolean solution(String s) {
				ArrayDeque<Character> stack = new ArrayDeque<>(); // 스택 생성
				
				char[] a = s.toCharArray(); // 문자열을 
				for (char c : a) { // 문자열 a를 전부 돌면서
						if (c == '(') { // 문자열 c가 여는 괄호인 경우
								stack.push(c); // 스택에 여는 괄호 추가
						} else { // 여는 괄호가 아닌 경우 
								if (stack.isEmpty() || stack.pop() == c) // 스택이 비어있거나, pop한 값이 열린 괄호가 아닌 경우
										return false;
						}
				}
				return stack.isEmpty();
		}
}