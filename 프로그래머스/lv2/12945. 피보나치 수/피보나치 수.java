class Solution {
    public int solution(int n) {
        long num1 = 0;
        long num2 = 1;
        for(int i = 0; i < n; i++){
            long sum = num1 + num2;
            if (sum >= 1234567) {
                num1 = num2 % 1234567;
                num2 = sum % 1234567;
            } else {
                num1 = num2;
                num2 = sum;
            }
        }
        int answer = (int) num1;
        return answer;
    }
}