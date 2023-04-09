class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == ' ') { // 공백 구별
                answer.append(" ");
            } else if (Character.isLowerCase(arr[i])) { // 대소문자 구별 (소문자일때)
                if (arr[i] + n > 'z') {
                    answer.append((char) (arr[i] + n - 26)); // n만큼 밀어서 다른 알파벳으로 바꿈
                } else {
                    answer.append((char) (arr[i] + n));
                }
            } else { // 대문자일때
                if (arr[i] + n > 'Z') {
                    answer.append((char) (arr[i] + n - 26));
                } else {
                    answer.append((char) (arr[i] + n));
                }
            }
        }
        return answer.toString();
    }
}