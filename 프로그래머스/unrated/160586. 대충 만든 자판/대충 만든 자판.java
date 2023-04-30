import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> pressCount = new HashMap<>(); // key: 문자, value: 최소 입력 횟수

        for (String key : keymap) { // 각 문자를 입력하기 위해 키를 누르는 최소 횟수를 맵에 저장
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                if (!pressCount.containsKey(ch)) {
                    pressCount.put(ch, i + 1); // pressKey에 해당 문자가 없으면 새로 추가
                    continue;
                }
                if (pressCount.get(ch) > i) {
                    pressCount.replace(ch, i + 1); // 이미 있으면 입력 횟수를 비교하여 더 적게 누르는 횟수를 저장
                }
            }
        }

        for (int i = 0; i < targets.length; i++) { // 각 문자열을 만들기 위한 최소 횟수를 계산하여 answer에 저장
            int sumTotal = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char ch = targets[i].charAt(j);
                if (!pressCount.containsKey(ch)) { // 해당 문자가 어디에도 존재하지 않으면 -1을 첫번째 인덱스에 저장
                    sumTotal = -1;
                    break;
                }
                sumTotal += pressCount.get(ch); // 그렇지 않다면, 해당 문자의 입력 횟수를 press에 더해줌
            }
            answer[i] = sumTotal;
        }
        return answer;
    }
}