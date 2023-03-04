import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String s = "*";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++) System.out.print(s);
            System.out.print("\n");
        }
    }
}