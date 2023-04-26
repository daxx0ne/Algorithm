import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int fail = 0;
            int all = 0;
            double per = 0;
            for (int j : stages) {
                if (j >= i) {
                    all++;
                    if (j == i) {
                        fail++;
                    }
                }
            }
            if (all != 0 && fail != 0) {
                per = (double) fail / all;
            }
            map.put(i, per);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        int[] answer = new int[list.size()];
        for(int i = 0; i < N; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}