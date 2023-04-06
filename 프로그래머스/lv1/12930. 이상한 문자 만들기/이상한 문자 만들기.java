class Solution {
    public String solution(String s) {
        String answer = "";
        String text = "";
        int space = 0;
        for(int i = 0; i < s.length(); i++){
            text = s.substring(i, i+1); // 한 글자씩 자름
            if(text.equals(" ")){ // 공백 문자 있을 때
                answer += text; 
                space = 0; // 리셋 (공백 기준 단어 별로 짝/홀 판단)
            }
            else{
                if(space % 2 == 0){ // 짝수 인덱스일 때
                    answer += text.toUpperCase(); // 대문자로 바꿈
                }
                else { // 홀수 인덱스일 때
                    answer += text.toLowerCase(); // 소문자로 바꿈
                }
                space++; 
            }
        }
        return answer; // 바꾼 문자열 리턴
    }
}