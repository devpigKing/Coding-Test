import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i<n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        long cnt = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= A[i]) {
                stack.pop();
            }

            stack.push(A[i]);
            cnt += stack.size()-1;
        }
        System.out.println(cnt);

    }
}
