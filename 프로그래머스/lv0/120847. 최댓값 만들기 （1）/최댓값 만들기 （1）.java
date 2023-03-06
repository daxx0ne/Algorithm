import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length-2] * numbers[numbers.length-1];
        return answer;
    }
}