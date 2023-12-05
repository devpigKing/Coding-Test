class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        // a, b, c 매개변수가 모두 다를 때
        if (a != b && b != c && c != a) {
            answer = a + b + c;
        }
        // 두 매개 변수가 같을 때
        else if (a == b && b != c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (b == c && c != a) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if (c == a && a != b) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        // 세 매개변수가 모두 같을 때
        else if (a == b && b == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        }

        return answer;
    }
}