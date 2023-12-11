public class Solution {
    public String solution(String my_string, int m, int c) {
        int length = my_string.length();
        StringBuilder result = new StringBuilder();

        // 각 열에 해당하는 문자를 추출하여 결과에 추가
        for (int i = c - 1; i < length; i += m) {
            result.append(my_string.charAt(i));
        }

        return result.toString();
    }
}