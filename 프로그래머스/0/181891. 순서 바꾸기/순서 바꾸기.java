class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int flag = n;
        for(int i = 0; i < num_list.length - n; i++) {
            answer[i] = num_list[flag];
            flag++;
        }
        flag = 0;
        for(int i = num_list.length - n; i < num_list.length; i++) {
            answer[i] = num_list[flag];
            flag++;
        }
        return answer;
    }
}