class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str2.contains(str1) == true) {
            answer = 1;
        }
        return answer;
    }
}