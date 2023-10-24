class Solution {
    public int[] solution(long n) {
        // long n을 String 문자열로 변환
        String A = Long.toString(n);
        // A 문자열의 길이 크기의 배열 B를 생성
        int[] B = new int[A.length()];
        
        for (int i = A.length() - 1; i >= 0; i--){
            // B에 A 문자열의 가장 뒤부터 
            // charAt(i)를 통해 문자열 A에서 i번 째 문자를 가져온다.
            // - '0' 을 통해 해당 A.charAt(i)를 통해 나온 문자를 정수로 바꿔 배열 B에 저장한다.
            B[A.length()-1-i] = A.charAt(i) - '0';
        }
        return B;
        
    }
}