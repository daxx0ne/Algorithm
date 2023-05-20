class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length() - 4;
        for (int i = 0; i < length; i++) {
            answer += "*";
        }
        answer += phone_number.substring(length, phone_number.length());
        return answer;
    }
}