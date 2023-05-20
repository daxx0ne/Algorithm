import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        if (arr.length == 1) {
            list.add(-1);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if(min > arr[i]) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != min) {
                    list.add(arr[i]);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}