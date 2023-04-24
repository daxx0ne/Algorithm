class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        String[] arr = myString.split("");
        for (String s : arr) {
            if (s.equals("a")) {
                answer += s.toUpperCase();
            } else {
                answer += s;
            }
        }
        return answer;
    }
}