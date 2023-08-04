import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static int N;
    private static int[] nArr;
    private static int M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nArr = new int[N];
        for (int i = 0; i < N; i++) {
            nArr[i] = sc.nextInt();
        }
        Arrays.sort(nArr);
        M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int m = sc.nextInt();
            int start = 0;
            int end = N - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                int n = nArr[mid];
                if (n == m) {
                    sb.append(1 + " ");
                    break;
                }
                if (n > m) { 
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                if (start > end) {
                    sb.append(0 + " ");
                    break;
                }
            }
        }
        System.out.println(sb.toString());

    }

}