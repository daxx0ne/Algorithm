class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        String[] arr = s.split("");
        int count_p = 0;
        int count_y = 0;
        for (String value : arr) {
            if (value.equals("p")) {
                count_p++;
            } else if (value.equals("y")) {
                count_y++;
            }
        }
        if (count_p != count_y) {
            answer = false;
        }
        return answer;
    }
}