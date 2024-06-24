import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0; 
        int max_cnt = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        
        int cnt[] = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }
        
        for(int i=0; i<cnt.length; i++){
            if(max_cnt < cnt[i]) {
                max_cnt = cnt[i];
                answer = i;
            } else if(max_cnt == cnt[i]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}