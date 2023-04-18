import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long max = 0;
            long answer = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }
            for (int j = n - 1; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j]; // 마지막 값을 max로 두고, max 보다 큰 값이 들어올때 최대 주가로 바꾸기
                } else {
                    answer += (max - arr[j]); // 역방향으로 탐색하면서 max 보다 값이 작으면 판매
                }
            }
            System.out.println(answer);
        }
    }
}