import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] score = new int[10];

        for (int tc = 1; tc <= T; tc++) {
            for (int i = 0; i < 10; i++) {
                score[i] = sc.nextInt();
            }
            
            // max, min을 score 배열을 기준으로 계산
            int max = score[0];
            for (int i = 1; i < 10; i++) {
                if (score[i] > max) {
                    max = score[i];
                }
            }
            
            int min = score[0];
            for (int i = 1; i < 10; i++) {
                if (score[i] < min) {
                    min = score[i];
                }
            }
            
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += score[i];
            }
            
            int result = sum - (max + min);
            double average = result / 8.0; // 정수를 double로 나누는 방식
            System.out.println("#" + tc + " " + Math.round(average));
        }
    }
}