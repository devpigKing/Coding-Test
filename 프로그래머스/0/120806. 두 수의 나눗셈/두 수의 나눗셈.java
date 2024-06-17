class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / num2 * 1000; // double형 변수 answer 선언 후, 계산된 값 할당
        return (int) answer; // double형 변수를 int형으로 형변환 후 반환
    }
}