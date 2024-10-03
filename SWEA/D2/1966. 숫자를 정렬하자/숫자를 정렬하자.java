import java.util.Scanner;
import java.io.IOException;

class Solution {
    public static void main(String args[]) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스 수
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt(); // 배열의 크기
            int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt(); // 배열 입력
            }
            
            // 버블 정렬 (N까지 반복)
            for (int i = 0; i < N; i++) { // i는 0부터 N-1까지
                for (int j = 0; j < N - 1; j++) { // j는 0부터 N-2까지
                    if (arr[j] > arr[j + 1]) {
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            
            // 출력
            System.out.print("#" + tc + " ");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}