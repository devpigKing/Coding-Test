import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 입력 받을 문자열의 개수 입력 
        
        for (int i = 0; i < T; i++) { // 0부터 T-1번까지 T번 돌면서
            System.out.println(stack(sc.next())); // stack 메서드에 하나씩 보낸다!
        }
    }
    
    public static String stack(String s) {
        Stack<Character> stack = new Stack<>(); // 스택 생성
        
        for (char c : s.toCharArray()) { // s 문자열을 배열로 바꿔서 문자 하나하나 돌면서 비교!
            switch (c) {
                case '(': // 열린 괄호이면
                    stack.push(c); // 스택에 푸시
                    break; 
                case ')': // 닫힌 괄호라면
                    if (stack.isEmpty()) { // 스택이 비어있다면 짝을 이룰 수 없으므로
                        return "NO"; // NO 출력
                    }
                    stack.pop(); // stack에 뭔가 있다면 열린 괄호이므로 pop해서 짝 지어줌.
                    break;
            }
        }
        
        if (stack.isEmpty()) { // 반복문이 끝나고 스택이 비어있다면
            return "YES"; // 조건 만족
        } else { // 뭔가 남아있다면(열린 괄호)
            return "NO"; // 조건 불만족
        }
    }
}