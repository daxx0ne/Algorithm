import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num1 = 0;
        long num2 = 1;
        for (int i = 0; i < n; i++) {
            long sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(num1);
    }
}
