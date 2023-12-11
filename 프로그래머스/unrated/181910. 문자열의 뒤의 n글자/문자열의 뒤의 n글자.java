public class Solution {
    public String solution(String my_string, int n) {
        int length = my_string.length();
        
        // 뒤에서 n글자로 이루어진 문자열 추출
        String result = my_string.substring(length - n, length);
        
        return result;
    }
}