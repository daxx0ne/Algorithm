class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = end;
            end++;
        }
        return answer;
    }
}