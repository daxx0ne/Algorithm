class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int code2 = code;
        while(code2 <= cipher.length()){
            answer += cipher.charAt(code2 - 1);
            code2 += code;
        }
        return answer;
    }
}