import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < arr.length; i++) {
            int w = sc.nextInt();
            arr[i] = w;
        }
        Arrays.sort(arr);
        int s = arr[0] + arr[2 * n - 1];
        for (int j = 0; j < n; j++) {
            int sum = arr[j] + arr[(2 * n - 1) - j];
            if (s > sum){
                s = sum;
            }
        }
        System.out.println(s);
    }
}
