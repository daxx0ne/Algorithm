class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        if(str1.contains(str2) == true){
            answer = 1;
        }
        return answer;
    }
}