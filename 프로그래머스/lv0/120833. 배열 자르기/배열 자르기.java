class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int [num2 - num1 + 1]; // 배열의 크기를 설정
        int a = 0;
		for(int i = num1; i<=num2; i++) { // num1부터 num2가 될 때까지 반복
			answer[a] = numbers[i]; // answer 배열에 num1부터 num2까지의 요소를 대입
			a++;
		}
        return answer;
    }
}