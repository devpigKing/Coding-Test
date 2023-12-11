public class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArray = my_string.toCharArray();
        
        // s부터 e까지의 부분 문자열을 뒤집기
        reverseSubstring(charArray, s, e);
        
        // 뒤집은 문자열 반환
        return new String(charArray);
    }

    private void reverseSubstring(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}