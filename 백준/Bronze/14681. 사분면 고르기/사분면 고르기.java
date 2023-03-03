import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0){ //1사분면
            System.out.println("1");
        }
        else if (x < 0 && y > 0){ //2사분면
            System.out.println("2");
        }
        else if (x < 0 && y < 0){ //3사분면
            System.out.println("3");
        }
        else if (x > 0 && y < 0){ //4사분면
            System.out.println("4");
        }
    }
}