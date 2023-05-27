class Solution {
    public int solution(int a, int b) {
        String case1 = String.valueOf(a) + String.valueOf(b);
        String case2 = String.valueOf(b) + String.valueOf(a);
        int answer = Math.max(Integer.parseInt(case1), Integer.parseInt(case2));
        return answer;
    }
}