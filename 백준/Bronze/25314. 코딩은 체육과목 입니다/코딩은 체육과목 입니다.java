import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int save = n / 4;
        for (int i = 0; i < save; i++) {
            System.out.print("long ");
        }
        sc.close();
        System.out.print("int");
    }
}