import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }

        int tmp;
        while (que.size() > 1) {
            que.poll();
            if(que.size() == 1) break;
            tmp = que.poll();
            que.add(tmp);
            
        }
        System.out.println(que.poll());


    }
}