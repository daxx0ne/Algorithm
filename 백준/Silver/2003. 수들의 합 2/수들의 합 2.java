import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int answer = arr[i];
            if(arr[i] == m){
                count++;
            }
            for(int j = i + 1; j < n; j++){
                answer += arr[j];
                if(answer == m){
                    count++;
                    break;
                }
                else if(answer > m){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}