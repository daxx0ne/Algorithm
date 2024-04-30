import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer sc = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(sc.nextToken());
            arr[i][1] = Integer.parseInt(sc.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    count++;
                }
            }
            rank[i] = count;
        }
        for(int i = 0; i < N; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}