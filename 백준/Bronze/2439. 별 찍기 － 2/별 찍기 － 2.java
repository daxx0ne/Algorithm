import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String x = "*";
        String y = " ";
        for (int i = 1; i < t + 1; i++) {
            String star = "";
            star = y.repeat(t - i) + x.repeat(i);
            System.out.println(star);
        }
    }
}