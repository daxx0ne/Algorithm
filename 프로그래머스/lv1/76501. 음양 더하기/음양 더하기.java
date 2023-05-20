class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++) {
            if (signs[i] == false) {
                absolutes[i] *= -1;
            }
        }
        for (int i : absolutes) {
            answer += i;
        }
        return answer;
    }
}