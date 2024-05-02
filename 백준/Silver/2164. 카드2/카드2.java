import javax.management.ValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> card = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            card.add(i);
        }
        int i = 1;
        while(true) {
            if(card.size() == 1) break;
            if(i % 2 == 0) {
                card.add(card.poll());
            }
            else{
                card.poll();
            }
            i++;
        }
        System.out.println(card.peek());
    }
}