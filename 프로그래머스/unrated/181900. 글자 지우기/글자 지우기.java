class Solution {
    public static String solution(String my_string, int[] indices) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            // indices 배열에 현재 인덱스가 없으면 해당 글자를 결과에 추가
            if (!contains(indices, i)) {
                result.append(my_string.charAt(i));
            }
        }

        return result.toString();
    }

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}