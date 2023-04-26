import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] supoza1 = {1, 2, 3, 4, 5};
        int[] supoza2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoza3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        int a = 1;
        int temp = 0;
        for (int k : answers) { // 수포자1 점수 구하기
            if (supoza1[temp] == k) {
                score[0] += a;
            }
            temp++;
            if (temp == 5) {
                temp = 0;
            }
        }
        temp = 0;
        for (int k : answers) { // 수포자2 점수 구하기
            if (supoza2[temp] == k) {
                score[1] += a;
            }
            temp++;
            if (temp == 8) {
                temp = 0;
            }
        }
        temp = 0;
        for (int k : answers) { // 수포자3 점수 구하기
            if (supoza3[temp] == k) {
                score[2] += a;
            }
            temp++;
            if (temp == 10) {
                temp = 0;
            }
        }
        int max = score[0];
        int high = 0;
        for (int j : score) { // 최대 점수 구하기
            if (max < j) {
                max = j;
            }
        }
        for (int j : score) { // 가장 문제를 많이 맞힌 사람이 몇 명인지 구하기
            if (j == max) {
                high++;
            }
        }
        int[] answer = new int[high];
        int index = 0;
        for (int i = 0; i < score.length; i++) { // 배열에 인덱스 채우기
            if (score[i] == max) {
                answer[index] = i + 1;
                index++;
            }
        }
        Arrays.sort(answer); // 오름차순 정렬
        return answer;
    }
}