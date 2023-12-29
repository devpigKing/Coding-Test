class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = myString.replace('A', 'C');
        String result2 = result.replace('B', 'A');
        String result3 = result2.replace('C', 'B');
        
        if (result3.contains(pat)) {
            answer++;
        }
        
        return answer;
    }
}