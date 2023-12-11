import java.util.Arrays;

public class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] suffixArray = new String[length];

        // 모든 접미사 생성
        for (int i = 0; i < length; i++) {
            suffixArray[i] = my_string.substring(i);
        }

        // 접미사 배열을 사전순으로 정렬
        Arrays.sort(suffixArray);

        return suffixArray;
    }
}