class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1); // 통분했을 때 분자
        int denom = denom1 * denom2; // 통분했을 때 분모
        for(int i = numer - 1; i > 1; i--){ // 기약분수 인지 체크
            if(numer % i == 0 && denom % i == 0){ // 기약분수가 아니면 약분해주기
                numer /= i;
                denom /= i;
            }
        }
        int[] answer = {numer, denom}; // 분수 덧셈한 결과 출력
        return answer;
    }
}