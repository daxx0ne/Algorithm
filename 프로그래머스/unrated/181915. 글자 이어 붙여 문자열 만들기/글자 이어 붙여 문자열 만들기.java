class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i = 0; i < index_list.length; i++) {
            int index = index_list[i];
            answer += my_string.charAt(index);
        }
        return answer;
    }
}