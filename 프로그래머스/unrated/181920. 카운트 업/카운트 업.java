import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> solution(int start_num, int end_num) {
        List<Integer> result = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 7;

        List<Integer> result = solution(start_num, end_num);
        System.out.println(result); // [3, 4, 5, 6, 7]
    }
}