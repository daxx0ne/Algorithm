import java.util.*;         

class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }
        String answer = "김서방은 " + index + "에 " + "있다";
        return answer;
    }
}