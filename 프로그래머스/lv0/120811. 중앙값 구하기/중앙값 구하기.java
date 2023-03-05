import java.util.Arrays; // 클래스 정의
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 정렬 메소드 사용하여 오름차순 정렬
        int answer = array[array.length/2]; // 중앙값 구하기
        return answer;
    }
}