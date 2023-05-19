class Solution {
    public int solution(int num) {
        long num2 = num;
        int answer = 0;
        while(num2 > 1) {
            if (num2 % 2 == 0) {
                num2 /= 2;
            }
            else {
                num2 = num2 * 3 + 1;
            }
            answer++;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}