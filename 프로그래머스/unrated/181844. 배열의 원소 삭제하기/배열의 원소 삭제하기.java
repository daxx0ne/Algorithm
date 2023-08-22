import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        
        for(int delNum : delete_list) {
            arrList.remove(Integer.valueOf(delNum));
        }
        
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}