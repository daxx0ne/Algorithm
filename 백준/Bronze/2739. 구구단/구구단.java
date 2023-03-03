import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            int sum = (x * i);
            System.out.println(x + " * " + i + " = " + sum);
        }
    }
}
