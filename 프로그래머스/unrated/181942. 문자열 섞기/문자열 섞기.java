class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String str = str1 + str2;
        int flag1 = 0;
        int flag2 = 1;
        for(int i = 0; i < str.length(); i++) {
            if(i % 2 == 0) {
                int x = i - flag1;
                flag1++;
                answer += str.charAt(x);
            }
            else {
                int x = i + str2.length() - flag2;
                flag2++;
                answer += str.charAt(x);
            }
        }
        return answer;
    }
}