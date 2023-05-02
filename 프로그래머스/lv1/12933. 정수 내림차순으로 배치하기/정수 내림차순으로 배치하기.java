import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = "";
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            temp += arr[arr.length - i - 1];
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}