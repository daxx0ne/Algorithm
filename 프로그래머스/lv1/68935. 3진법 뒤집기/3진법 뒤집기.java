class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n, 3);
        String reverse = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            reverse = reverse + temp.charAt(i);
        }
        answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}