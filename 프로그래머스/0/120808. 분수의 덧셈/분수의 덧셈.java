class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2 + numer2*denom1; // 분자의 합
        int denom = denom1*denom2; // 분모
        
        for (int i = numer-1; i > 1; i--) { // 최대공약수 구하기
            if(numer % i == 0 && denom % i == 0) { 
                numer /= i;
                denom /= i;
            }
        }
        
        int[] answer = { numer, denom }; // answer 배열에 값 넣기
        return answer;
    }
}