import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        long b_count = 0;
        long c_count = 0;
        for (int j = 0; j < n; j++) {
            if (b < arr[j]) {
                b_count++;
                if ((arr[j] - b) % c == 0) {
                    c_count += ((arr[j] - b) / c);
                } else c_count += ((arr[j] - b) / c) + 1;
            }
            else b_count++;
        }
        System.out.println(b_count + c_count);
    }
}
