import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num = 1;
            for (int j = 1; j <= b; j++) {
                num = num * a % 10;
            }
            if (num == 0) {
                num = 10;
            }
            System.out.println(num);
        }
    }
}