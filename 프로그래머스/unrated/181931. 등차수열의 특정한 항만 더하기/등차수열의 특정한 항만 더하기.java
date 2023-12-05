class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] result = new int[included.length];
        for (int i = 0; i < included.length; i++) { 
            result[i] = a + d * i;
            if (included[i]) { 
                answer += result[i];
            }
        }
        return answer;
    }
}