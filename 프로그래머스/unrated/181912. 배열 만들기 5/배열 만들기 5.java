import java.util.ArrayList;
import java.util.List;

class Solution { // 배열 만들기 5

    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) {
                answer.add(num);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}