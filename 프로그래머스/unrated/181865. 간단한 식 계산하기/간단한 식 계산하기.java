class Solution {
    public int solution(String binomial) {
        String[] base = binomial.split(" ");
        
        int a = Integer.parseInt(base[0]);
        String op = base[1];
        int b = Integer.parseInt(base[2]);
        
        int answer = 0;
        
        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else if (op.equals("*")) {
            answer = a * b;
        }
        
        return answer;
    }
}