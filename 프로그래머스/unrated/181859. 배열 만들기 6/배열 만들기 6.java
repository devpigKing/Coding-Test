import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < arr.length; i ++){
            if ( stk.isEmpty()) {
                stk.push(arr[i]);
            }
            else if ( stk.peek() == arr[i] ){
                stk.pop();
            }
            else if ( stk.peek() != arr[i]) {
                stk.push(arr[i]);
            }
        }

        if ( stk.isEmpty()){
            return new int [] {-1};
        }

        answer = new int [stk.size()];
        for ( int i = 0; i < stk.size(); i ++){
            answer[i] = stk.get(i);
        }

        return answer;
    }
}