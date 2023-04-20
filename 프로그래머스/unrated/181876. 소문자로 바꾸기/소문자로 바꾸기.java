class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(char k : myString.toCharArray()){
                sb.append(Character.toLowerCase(k));
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}