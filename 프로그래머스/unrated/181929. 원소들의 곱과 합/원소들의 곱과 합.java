class Solution {
    public int solution(int[] num_list) {
        int product = multiply(num_list);
        int sum = add(num_list);
        int squareOfSum = square(sum);

        if (product < squareOfSum) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int multiply(int[] num_list) {
        int result = 1;
        for (int num : num_list) {
            result *= num;
        }
        return result;
    }

    private static int add(int[] num_list) {
        int result = 0;
        for (int num : num_list) {
            result += num;
        }
        return result;
    }

    private static int square(int num) {
        return num * num;
    }
}