class Solution {
    public int[] solution(String myString) {
        String[] result = myString.split("x", myString.length());
        int[] answer = new int[result.length];
        
        for (int i = 0; i < result.length; i++) {
            answer[i] = result[i].length();
        }
        return answer;
    }
}