class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = a - b;
        if(flag == true) {
            answer = a + b;
        }
        return answer;
    }
}