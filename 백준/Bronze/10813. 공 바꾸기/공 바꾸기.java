import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[2];
        int[] ball = new int[n];
        for (int k = 0; k < n; k++) {
            ball[k] = k + 1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr[j] = sc.nextInt();
            }
            int temp = ball[arr[1] - 1];
            ball[arr[1] - 1] = ball[arr[0] - 1];
            ball[arr[0] - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}