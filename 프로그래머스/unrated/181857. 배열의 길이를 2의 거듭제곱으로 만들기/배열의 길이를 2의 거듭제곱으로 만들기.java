class Solution {

    public int[] solution(int[] arr) {

        int length = arr.length;
        int temp = 1;

        while (temp < length) {
            temp *= 2;
        }

        int[] answer = new int[temp];

        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}