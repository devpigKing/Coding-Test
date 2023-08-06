import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 상근이와 친구들은 총 M명
        // 입국심사대는 총 N개
        // k번 심사대에 앉아있는 심사관이 한 명을 심사하는데 드는 시간은 Tk
        // 한 심사대에서는 한 번에 한 사람만 심사.
        // 어떻게 심사를 받으면 모든 사람이 심사를 받는데 걸리는 시간이 최소??

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] time = new int[N];

        long max = 0;
        long min = 0;

        for(int i = 0; i < N; i++ ) {
            time[i] = Integer.parseInt(br.readLine());

            if (max < time[i]) {
                max = time[i];
            }

            if (min > time[i]) {
                min = time[i];
            }
        }

        long start = 0;
        long end = max*M;

        while (start <= end) {
            long mid = (start+end)/2;

            long sum = 0;
            for( int ti : time) {
                long cnt = mid / ti;

                if (sum >= M) {
                    break;
                }

                sum += cnt;
            }

            if ( sum < M ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        System.out.println(start);

    }
}
