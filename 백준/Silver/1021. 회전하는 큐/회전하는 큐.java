import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[M];
        int cnt = 0;

        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int goal = deque.indexOf(A[i]);
            int standard = (deque.size() - 1) / 2;

            if (goal <= standard) {
                for (int j = 0; j < goal; j++) {
                    int x = deque.pollFirst();
                    deque.offerLast(x);
                    cnt++;
                }
            } else {
                for (int j = 0; j < deque.size() - goal; j++) {
                    int x = deque.pollLast();
                    deque.offerFirst(x);
                    cnt++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(cnt);
    }
}
