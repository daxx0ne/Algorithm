import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        StringBuffer sb = new StringBuffer(s);
        String a = sb.reverse().toString();
        String[] arr = a.split("");
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}