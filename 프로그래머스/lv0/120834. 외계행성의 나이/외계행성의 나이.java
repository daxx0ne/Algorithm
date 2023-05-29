class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = String.valueOf(age);
        for(int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == '0') {
                answer += "a";
            }
            if(temp.charAt(i) == '1') {
                answer += "b";
            }
            if(temp.charAt(i) == '2') {
                answer += "c";
            }
            if(temp.charAt(i) == '3') {
                answer += "d";
            }
            if(temp.charAt(i) == '4') {
                answer += "e";
            }
            if(temp.charAt(i) == '5') {
                answer += "f";
            }
            if(temp.charAt(i) == '6') {
                answer += "g";
            }
            if(temp.charAt(i) == '7') {
                answer += "h";
            }
            if(temp.charAt(i) == '8') {
                answer += "i";
            }
            if(temp.charAt(i) == '9') {
                answer += "j";
            }
        }
        return answer;
    }
}