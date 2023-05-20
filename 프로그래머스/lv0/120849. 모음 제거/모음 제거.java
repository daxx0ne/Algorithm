class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replace("a", "");
        answer = answer.replace("e", "");
        answer = answer.replace("i", "");  
        answer = answer.replace("o", "");
        answer = answer.replace("u", "");
        return answer;
    }
}