class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result = a + "" + b;
        if (2*a*b > Integer.parseInt(result)) {
            answer = 2*a*b;
        } else if (2*a*b < Integer.parseInt(result)) {
            answer = Integer.parseInt(result);
        } else {
            answer = Integer.parseInt(result);
        }
        return answer;
    }
}