import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        int max = 0;
        int reward = 0;
        int same = 0;

        for (int i = 0; i < 3; i++) {
            dice[i] = sc.nextInt();
            if (max < dice[i]) {
                max = dice[i];
            }
        }

        for (int i = 0; i < 2; i++) {
            if (dice[i] == dice[i + 1] | dice[0] == dice[i]) {
                same = dice[i];
            }
        }

        if (dice[0] == dice[1] & dice[1] == dice[2]) {
            reward = 10000 + same * 1000;
        } else if (dice[0] == dice[1] | dice[1] == dice[2] | dice[0] == dice[2]) {
            reward = 1000 + same * 100;
        } else {
            reward = max * 100;
        }
        System.out.println(reward);
    }
}