class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++) {
            if(rsp.charAt(i) == '2') {
                answer += 0;
            }
            if(rsp.charAt(i) == '0') {
                answer += 5;
            }
            if(rsp.charAt(i) == '5') {
                answer += 2;
            }
        }
        return answer;
    }
}