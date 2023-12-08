public class Solution {
    public int solution(String number) {
        int sum = 0;

        // 각 자리 숫자의 합 구하기
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            // 문자를 정수로 변환
            int digitValue = digit - '0';
            sum += digitValue;
        }

        // 합을 9로 나눈 나머지 반환
        return sum % 9;
    }

}