class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        if(myString.indexOf(pat) != -1) {
            answer = 1;
        }
        return answer;
    }
}