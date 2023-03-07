class Solution {
    public int solution(int hp) {
        int general = 0;
         int soldier = 0;
         int worker = 0;

         general = hp / 5; // 장군개미
         hp %= 5;

         soldier = hp / 3; // 병정개미
         hp %= 3;

         worker = hp; // 일개미

         int answer = general + soldier + worker; // 최소 병력
        
        return answer;
    }
}