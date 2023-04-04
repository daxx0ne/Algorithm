import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]) // 배열 arr의 원소를 비교하여 중복이 없을때만,
                arrayList.add(arr[i]); // 해당 원소를 리스트에 담기
        }
        int[] answer = new int[arrayList.size()]; // 리스트에 담긴 원소 수만큼 배열 answer을 선언
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i); // 중복을 제거한 원소들을 배열에 넣어주고 반환
        }
        return answer;
    }
}