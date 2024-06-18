class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // numbers 정수 배열의 크기와 같은 int형 배열 answer 선언
        
        for ( int i = 0; i < numbers.length; i++ ) { // 인덱스 0번부터 끝까지 순차적으로 돌면서
            answer[i] = numbers[i] * 2; // numbers 배열의 요소 값 * 2의 값을 answer 배열에 삽입
        } 
        return answer; // solution 함수의 결과로 answer 배열 반환
    }
}