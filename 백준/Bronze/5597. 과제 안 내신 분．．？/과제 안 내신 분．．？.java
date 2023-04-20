import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[31];

        for (int k = 0; k < 28; k++) {
            int suc = sc.nextInt();
            num[suc] = 1;
        }

        for (int i = 1; i < 31; i++) {
            if (num[i] != 1) {
                System.out.println(i);
            }
        }
    }
}