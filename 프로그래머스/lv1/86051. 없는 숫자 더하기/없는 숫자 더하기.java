import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        Arrays.sort(numbers);
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] == i) {
                    answer -= i;
                    break;
                }
            }
        }
        return answer;
    }
}