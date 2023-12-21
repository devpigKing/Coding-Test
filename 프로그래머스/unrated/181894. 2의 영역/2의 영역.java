
class Solution {

    public int[] solution(int[] arr) {

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= start; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        if(start == 0 && end == 0) {
            return new int[]{-1};
        } 

        int[] answer = new int[end - start + 1];
        int idx = 0;
        for (int i = start; i <= end; i++) {
            answer[idx++] = arr[i];
        }

        return answer;
    }
}