class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) // num1과 같으면 
            answer = 1; // 변수에 1
        else   // 같지 않다면
            answer = -1; // 변수에 -1
        return answer; // 변수 반환
    }
}