import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int temp = progresses[i];
            while (temp < 100) {
                temp += speeds[i];
                day[i] += 1;
            }
            queue.add(day[i]);
        }
        while(!queue.isEmpty()) {
            int remains = queue.poll();
            int count = 1;
            while(!queue.isEmpty() && remains >= queue.peek()) {
                count++;
                queue.poll();
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}