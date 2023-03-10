class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s2.length; i++){
            for(int j = 0; j < s1.length; j++){
                if(s2[i].equals(s1[j])){ // 문자열이 같은지 비교할 때는 .equals() 를 사용
                    answer++;
                }
            }
        }
        return answer;
    }
}