class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; //answer 배열의 크기를 strlist의 길이만큼 설정
        
        for(int i=0; i<strlist.length; i++){ //strlist의 길이만큼 반복
            answer[i] = strlist[i].length(); //answer의 i번째 요소는 strlist의 i번째 문자열의 길이
        }
        return answer;
    }
}