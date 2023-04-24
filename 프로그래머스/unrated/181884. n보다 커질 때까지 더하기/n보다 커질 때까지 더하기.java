class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i : numbers) {
            answer += i;
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}