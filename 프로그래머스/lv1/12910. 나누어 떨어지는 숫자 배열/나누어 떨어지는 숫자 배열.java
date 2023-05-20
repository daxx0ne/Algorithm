import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
        if(arr[i] % divisor == 0) {
        list.add(arr[i]);
        }
        }
        if(list.size() == 0) {
        list.add(-1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
        answer[i] = list.get(i);
        }
        return answer;
    }
}