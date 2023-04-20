import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시
        int b = sc.nextInt(); // 분

        int c = sc.nextInt(); // 요리하는데 필요한 시간

        b += c;
        if (b >= 60) {
           a += b / 60;
           b = b % 60;
           if (a >= 24) {
               a -= 24;
           }
        }
        System.out.println(a + " " + b);
    }
}