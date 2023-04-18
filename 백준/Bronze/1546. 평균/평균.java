import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        double max = arr[arr.length - 1];
        double avg = 0;
        for(int i = 0; i < n; i++){
            arr[i] = (arr[i] / max) * 100;
            avg += arr[i];
        }
        avg = avg / n;
        System.out.println(avg);
    }
}