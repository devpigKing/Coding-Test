import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            System.out.println(stack(sc.next()));
        }
    }
    
    public static String stack(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return "NO";
                    }
                    stack.pop();
                    break;
            }
        }
        
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}