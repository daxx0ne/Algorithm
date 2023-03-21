import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                stack.pop();
            } else stack.push(num);
        }

        for (int j : stack) {
            sum += j;
        }

        System.out.println(sum);
    }
}