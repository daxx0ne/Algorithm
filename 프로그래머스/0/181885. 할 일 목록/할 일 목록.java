import java.io.*;
import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) count++;
        }
        String[] answer = new String[count];
        int flag = 0;
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                answer[flag] = todo_list[i];
                flag++;
            }
        }
        return answer;
    }
}