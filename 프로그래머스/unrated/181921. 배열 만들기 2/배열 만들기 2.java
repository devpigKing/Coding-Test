import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (containsOnly05(i)) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        } else {
            return resultList.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    private static boolean containsOnly05(int number) {
        String strNumber = Integer.toString(number);

        for (char digit : strNumber.toCharArray()) {
            if (digit != '0' && digit != '5') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] result1 = solution(5, 555);
        int[] result2 = solution(10, 20);

        System.out.println(Arrays.toString(result1)); // [5, 50, 55, 500, 505, 550, 555]
        System.out.println(Arrays.toString(result2)); // [-1]
    }
}