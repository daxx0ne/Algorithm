class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int temp = 0;
        int temp2 = 0;
        while(chicken > 0) {
            temp = chicken / 10;
            if (chicken < 10) {
                temp2 = temp;
            }
            else {
                temp2 = chicken % 10;
            }
            chicken = temp + temp2;
            answer += temp;
        }
        return answer;
    }
}