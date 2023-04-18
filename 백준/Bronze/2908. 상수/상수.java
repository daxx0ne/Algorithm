import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        StringBuffer sb1 = new StringBuffer(num1);
        sb1.reverse();
        String num2 = sc.next();
        StringBuffer sb2 = new StringBuffer(num2);
        sb2.reverse();

        int a = Integer.parseInt(String.valueOf(sb1));
        int b = Integer.parseInt(String.valueOf(sb2));

        if(a < b) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}