import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 집의 수를 입력 받는다.

        // 각 집을 빨강, 초록, 파랑으로 칠하는 비용을 저장할 배열
        int[][] cost = new int[n][3];

        // 집마다 칠하는 비용을 입력받아 저장
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); // 빨강 비용
            cost[i][1] = Integer.parseInt(st.nextToken()); // 초록 비용
            cost[i][2] = Integer.parseInt(st.nextToken()); // 파랑 비용
        }

        // dp 배열 초기화
        int[][] dp = new int[n][3];
        dp[0][0] = cost[0][0]; // 첫 집을 빨강으로 칠하는 비용
        dp[0][1] = cost[0][1]; // 첫 집을 초록으로 칠하는 비용
        dp[0][2] = cost[0][2]; // 첫 집을 파랑으로 칠하는 비용

        // 두 번째 집부터 마지막 집까지 반복
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][0]; // i번째 집을 빨강으로 칠할 때
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i][1]; // i번째 집을 초록으로 칠할 때
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i][2]; // i번째 집을 파랑으로 칠할 때
        }

        // 마지막 집을 어떤 색으로 칠하는 것이 최소 비용인지 계산
        int minCost = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));

        System.out.println(minCost); // 최소 비용 출력
    }
}