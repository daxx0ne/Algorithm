import java.util.*;
class Solution {
    public String solution(String my_string, String alp) {
        String upper = alp.toUpperCase();
        String answer = my_string.replace(alp.charAt(0), upper.charAt(0));
        return answer;
    }
}