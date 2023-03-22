class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0L;
        for(int i = 1; i <= count; i++){
            cost += (long) price * i;
        }
        long answer = cost - money;
        if(money >= cost) {
            answer = 0;
        }
        return answer;
    }
}