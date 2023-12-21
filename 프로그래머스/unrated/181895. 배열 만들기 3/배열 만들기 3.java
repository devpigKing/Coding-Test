import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> result = new ArrayList<>();

        // 첫 번째 구간 추가
        int firstStart = intervals[0][0];
        int firstEnd = intervals[0][1];
        for (int i = firstStart; i <= firstEnd; i++) {
            result.add(arr[i]);
        }

        // 두 번째 구간 추가
        int secondStart = intervals[1][0];
        int secondEnd = intervals[1][1];
        for (int i = secondStart; i <= secondEnd; i++) {
            result.add(arr[i]);
        }

        // List를 배열로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}