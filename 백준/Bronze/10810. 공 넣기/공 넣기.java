import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[3];
        int[] ball = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = arr[0]; j <= arr[1]; j++) {
                ball[j - 1] = arr[2];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}