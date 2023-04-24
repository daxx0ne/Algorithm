class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int i : num_list) {
            mul *= i;
            sum += i;
        }
        if(mul < sum * sum) {
            answer = 1;
        }
        return answer;
    }
}