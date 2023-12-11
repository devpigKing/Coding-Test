public class Solution {
    public int solution(String my_string, String is_prefix) {
        int myStringLength = my_string.length();
        int isPrefixLength = is_prefix.length();

        if (isPrefixLength > myStringLength) {
            return 0;
        }

        String prefixCandidate = my_string.substring(0, isPrefixLength);

        return prefixCandidate.equals(is_prefix) ? 1 : 0;
    }
}