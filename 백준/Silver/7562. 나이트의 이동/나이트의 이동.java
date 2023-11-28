import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int I = sc.nextInt(); // 체스판 한 변의 길이
            int[][] chess = new int[I][I];

            int startX = sc.nextInt(); // 시작 위치 x 좌표
            int startY = sc.nextInt(); // 시작 위치 y 좌표

            int endX = sc.nextInt(); // 도착 위치 x 좌표
            int endY = sc.nextInt(); // 도착 위치 y 좌표

            int result = bfs(I, chess, startX, startY, endX, endY);
            System.out.println(result);
        }

        sc.close();
    }

    static int bfs(int I, int[][] chess, int startX, int startY, int endX, int endY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY, 0});
        chess[startX][startY] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int move = current[2];

            if (x == endX && y == endY) {
                return move;
            }

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < I && ny >= 0 && ny < I && chess[nx][ny] == 0) {
                    queue.offer(new int[]{nx, ny, move + 1});
                    chess[nx][ny] = 1;
                }
            }
        }

        return -1; // 도착할 수 없는 경우
    }
}