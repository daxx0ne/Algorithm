class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] arr = num_str.split("");
        for(String s : arr){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}