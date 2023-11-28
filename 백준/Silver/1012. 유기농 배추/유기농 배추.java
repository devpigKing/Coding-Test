import java.util.Scanner;

public class Main {
    static int[][] field;
    static int M, N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            M = sc.nextInt(); // 가로 길이
            N = sc.nextInt(); // 세로 길이
            int K = sc.nextInt(); // 배추 위치 개수

            field = new int[M][N];

            // 배추 위치 입력
            for (int k = 0; k < K; k++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                field[X][Y] = 1;
            }

            int count = 0; // 필요한 지렁이 수

            // 배추밭을 탐색하면서 배추가 심어져 있는 곳을 찾고, 해당 위치에서 DFS 수행
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (field[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }

    // DFS를 통해 배추 주변의 배추들을 모두 체크
    static void dfs(int x, int y) {
        // 주어진 배열의 범위를 벗어나거나 이미 방문한 경우 종료
        if (x < 0 || y < 0 || x >= M || y >= N || field[x][y] == 0) {
            return;
        }

        // 현재 위치를 방문 처리
        field[x][y] = 0;

        // 상하좌우에 대해서 DFS 수행
        dfs(x - 1, y); // 상
        dfs(x + 1, y); // 하
        dfs(x, y - 1); // 좌
        dfs(x, y + 1); // 우
    }
}