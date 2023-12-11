public class Solution {
    public int solution(String my_string, String is_suffix) {
        int myStringLength = my_string.length();
        int isSuffixLength = is_suffix.length();

        // is_suffix의 길이가 my_string의 길이보다 크면 무조건 0을 반환
        if (isSuffixLength > myStringLength) {
            return 0;
        }

        // my_string에서 뒤에서부터 is_suffix 길이만큼 잘라내어 비교
        String suffixCandidate = my_string.substring(myStringLength - isSuffixLength);
        
        // is_suffix와 일치하면 1, 아니면 0 반환
        return suffixCandidate.equals(is_suffix) ? 1 : 0;
    }
}