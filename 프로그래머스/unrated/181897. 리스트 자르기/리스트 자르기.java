import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> result = new ArrayList<>();

        switch (n) {
            case 1:
                result = sliceArray(num_list, 0, b + 1);
                break;
            case 2:
                result = sliceArray(num_list, a, num_list.length);
                break;
            case 3:
                result = sliceArray(num_list, a, b + 1);
                break;
            case 4:
                for (int i = a; i <= b; i += c) {
                    result.add(num_list[i]);
                }
                break;
        }

        // List를 배열로 변환
        answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    // 배열을 슬라이스하는 함수
    private List<Integer> sliceArray(int[] array, int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(array[i]);
        }
        return result;
    }
}