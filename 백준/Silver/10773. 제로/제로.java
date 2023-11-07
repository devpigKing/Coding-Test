import java.util.Stack;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = sc.nextInt();
		
		for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
		int sum = 0;
		
		for(int i : stack) {
			sum += i;
		}
 
		System.out.println(sum);		
	}
 
}