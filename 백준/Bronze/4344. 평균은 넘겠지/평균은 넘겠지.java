import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            double avg = 0;
            double per = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                avg += arr[j];
            }
            avg = avg / n;
            for (int j = 0; j < n; j++) {
                if(arr[j] > avg) {
                    per++;
                }
            }
            per = (per * 100) / n;
            System.out.printf("%.3f", per);
            System.out.println("%");
        }
    }
}
