import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);
        for(int i = 0; i < 3; i++){
            System.out.print(arr[i] + " ");
        }
    }
}