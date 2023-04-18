import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt() % 42;
        }
        Arrays.sort(arr);
        int count = 1;
        for(int i = 0; i < 9; i++){
            if(arr[i] != arr[i + 1]){
                count++;
            }
        }
        System.out.println(count);
    }
}