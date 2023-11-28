import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0}; // 상, 우, 하, 좌
    static int[] dy = {0, 1, 0, -1};

    static int N;
    static char[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        map = new char[N][N];
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            map[i] = input.toCharArray();
        }

        // 적록색약이 아닌 경우
        int normalCount = countRegions(false);
        System.out.print(normalCount + " ");

        // 적록색약인 경우
        int blindCount = countRegions(true);
        System.out.println(blindCount);

        sc.close();
    }

    static int countRegions(boolean isBlind) {
        boolean[][] visited = new boolean[N][N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, isBlind, visited);
                    count++;
                }
            }
        }

        return count;
    }

    static void dfs(int x, int y, boolean isBlind, boolean[][] visited) {
        visited[x][y] = true;
        char color = map[x][y];

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (isValid(nx, ny) && !visited[nx][ny]) {
                if (!isBlind) {
                    if (map[nx][ny] == color) {
                        dfs(nx, ny, isBlind, visited);
                    }
                } else {
                    if (color == 'B' && map[nx][ny] == 'B') {
                        dfs(nx, ny, isBlind, visited);
                    } else if (color != 'B' && map[nx][ny] != 'B') {
                        dfs(nx, ny, isBlind, visited);
                    }
                }
            }
        }
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}