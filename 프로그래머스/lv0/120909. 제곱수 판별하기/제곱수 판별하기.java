class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 1000; i++){
            if(i * i == n){
                answer = 1;
            }
        }
        if(answer != 1){
            answer = 2;
        }
        return answer;
    }
}