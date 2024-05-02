import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        for (int i = 0; i < m; i++) {
            int power = Integer.parseInt(br.readLine());
            int start = 0;
            int end = n - 1;
            while (start <= end) { 
                int mid = (start + end) / 2;
                if(Integer.parseInt(arr[mid][1]) < power) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            sb.append(arr[start][0]).append("\n");
        }
        System.out.println(sb);
    }
}