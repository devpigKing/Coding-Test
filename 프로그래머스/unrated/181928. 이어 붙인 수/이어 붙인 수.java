class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                sb2.append(num);
            } else {
                sb1.append(num);
            }
        }

        int Sb1Sum = Integer.parseInt(sb1.toString());
        int Sb2Sum = Integer.parseInt(sb2.toString());

        return Sb1Sum + Sb2Sum;
    }
}