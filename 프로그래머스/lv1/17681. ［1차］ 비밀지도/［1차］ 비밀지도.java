class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // '2진수' 변환
            answer[i] = answer[i].replace("0", " "); // '0 -> 공백' 변환
            answer[i] = answer[i].replace("1", "#"); // '1 -> #'' 변환
            while (answer[i].length() < n) {
                answer[i] = " " + answer[i]; // 길이 비교 후 부족할 때마다 앞에 공백을 추가
            }
        }
        return answer;
    }
}