import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int[] operator = new int[4];
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }
        find(arr[0], 0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void find(int num, int index) {
        if (index == n - 1) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                switch (i) {
                    case 0 -> find(num + arr[index + 1], index + 1);
                    case 1 -> find(num - arr[index + 1], index + 1);
                    case 2 -> find(num * arr[index + 1], index + 1);
                    case 3 -> find(num / arr[index + 1], index + 1);
                }
                operator[i]++; // 연산자 개수 다시 돌려놓기
            }
        }
    }
}