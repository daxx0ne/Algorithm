class Solution {
    public int solution(int n, int t) {
        int mul = 0;
        int answer = 0;
        for (int i = 1; i <= t; i++) {
            mul = n * 2;
            n = mul;
            answer = mul;
        }
        return answer;
    }
}