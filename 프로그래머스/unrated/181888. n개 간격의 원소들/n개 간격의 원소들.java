class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = 0;
        if(num_list.length % n != 0) {
            size = (num_list.length / n) + 1;
        }
        else {
            size = num_list.length / n;
        }
        int[] answer = new int[size];
        int num = 0;
        for(int i = 0; i < size; i++) {
            answer[i] = num_list[num];
            num += n;
        }
        return answer;
    }
}