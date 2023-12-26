import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
                list.add(arr[i]);
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] *= 2;
                list.add(arr[i]);
            } else {
                arr[i] = arr[i];
                list.add(arr[i]);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}