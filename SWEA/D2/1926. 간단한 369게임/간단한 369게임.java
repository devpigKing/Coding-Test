import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 입력값 N
        
        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);
            int cnt = 0;  // 박수 횟수
            
            // 각 자리의 숫자가 3, 6, 9인지 확인
            for (char ch : str.toCharArray()) {
                if (ch == '3' || ch == '6' || ch == '9') {
                    cnt++;
                }
            }
            
            // 박수 횟수가 1 이상이면 "-" 출력
            if (cnt > 0) {
                for (int j = 0; j < cnt; j++) {
                    System.out.print("-");
                }
                System.out.print(" ");  // 숫자 사이 간격
            } else {
                System.out.print(i + " ");  // 박수가 없으면 숫자 출력
            }
        }
    }
}