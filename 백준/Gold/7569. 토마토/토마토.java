import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt(); // 상자의 가로 칸 수
        int N = sc.nextInt(); // 상자의 세로 칸 수
        int H = sc.nextInt(); // 상자의 높이

        int[][][] box = new int[H][N][M];
        boolean[][][] visited = new boolean[H][N][M];

        // 토마토 상태 입력
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    box[h][i][j] = sc.nextInt();
                }
            }
        }

        int days = bfs(box, visited, M, N, H);

        // 결과 출력
        if (checkAllRipened(box, M, N, H)) {
            System.out.println(days);
        } else {
            System.out.println("-1");
        }

        sc.close();
    }

    static int bfs(int[][][] box, boolean[][][] visited, int M, int N, int H) {
        Queue<Tomato> queue = new LinkedList<>();

        // 익은 토마토를 큐에 넣음
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (box[h][i][j] == 1) {
                        queue.offer(new Tomato(h, i, j, 0));
                        visited[h][i][j] = true;
                    }
                }
            }
        }

        int days = 0;

        while (!queue.isEmpty()) {
            Tomato current = queue.poll();

            for (int d = 0; d < 6; d++) {
                int nh = current.h + dz[d];
                int ni = current.i + dx[d];
                int nj = current.j + dy[d];

                if (isValid(nh, ni, nj, H, N, M) && !visited[nh][ni][nj] && box[nh][ni][nj] == 0) {
                    // 새로운 토마토를 큐에 넣음
                    queue.offer(new Tomato(nh, ni, nj, current.days + 1));
                    visited[nh][ni][nj] = true;
                    box[nh][ni][nj] = 1; // 익은 토마토로 표시
                    days = current.days + 1;
                }
            }
        }

        return days;
    }

    static boolean isValid(int h, int i, int j, int H, int N, int M) {
        return h >= 0 && h < H && i >= 0 && i < N && j >= 0 && j < M;
    }

    static boolean checkAllRipened(int[][][] box, int M, int N, int H) {
        for (int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (box[h][i][j] == 0) {
                        return false; // 아직 익지 않은 토마토가 있으면 false 반환
                    }
                }
            }
        }
        return true; // 모든 토마토가 익었으면 true 반환
    }
}

class Tomato {
    int h, i, j, days;

    public Tomato(int h, int i, int j, int days) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.days = days;
    }
}