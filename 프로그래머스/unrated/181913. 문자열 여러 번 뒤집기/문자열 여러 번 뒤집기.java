public class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();

        for (int[] query : queries) {
            reverseSubstring(charArray, query[0], query[1]);
        }

        return new String(charArray);
    }

    private void reverseSubstring(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }

}