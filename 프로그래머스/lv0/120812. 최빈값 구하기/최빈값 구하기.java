class Solution {
    public int solution(int[] array) {
        int answer = 0; // 최빈값
        int max = Integer.MIN_VALUE; // 최대값 저장
        int[] index = new int[1001]; // 인덱스 카운팅

        for (int j : array) {
            index[j]++; // 개수 세서 인덱스 배열에 카운팅 결과 반영
        }
        for(int i = 0; i < index.length; i++){
            if(max < index[i]){
                max = index[i]; // 가장 많이 카운팅 된 수가 최빈값
                answer = i;
            }
        }
        int check = 0; // 최빈값이 하나인지 아닌지 체크
        for (int j : index) {
            if (max == j) {
                check++; 
            } else if (check > 1) { // 최빈값이 여러개면 -1 출력
                answer = -1;
            }
        }
        return answer;
    }
}