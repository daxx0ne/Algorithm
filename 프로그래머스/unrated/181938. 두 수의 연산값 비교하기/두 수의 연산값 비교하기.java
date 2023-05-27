class Solution {
    public int solution(int a, int b) {
        String case1 = String.valueOf(a) + String.valueOf(b);
        int case2 = 2 * a * b;
        int answer = Math.max(Integer.parseInt(case1), case2);
        return answer;
    }
}