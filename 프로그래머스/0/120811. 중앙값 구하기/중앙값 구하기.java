import java.util.Arrays;

class Solution {
    public int solution(int[] array) {

        int answer = 0;
        Arrays.sort(array); // array 배열 정렬
        
        answer = array[array.length/2]; // 중앙값 찾아 answer 변수에 삽입
        
        return answer; // answer 변수 반환
    }
}