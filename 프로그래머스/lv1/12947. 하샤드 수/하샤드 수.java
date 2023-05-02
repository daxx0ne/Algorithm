class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] arr = String.valueOf(x).split("");
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}