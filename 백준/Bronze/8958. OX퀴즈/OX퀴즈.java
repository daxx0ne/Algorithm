import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int point = 1;
            int score = 0;
            String result = sc.next();
            String[] arr = result.split("");
            for (int j = 0; j < result.length(); j++) {
                if(arr[j].equals("O")){
                    score += point;
                    point++;
                }
                else {
                    point = 1;
                }
            }
            System.out.println(score);
        }
    }
}