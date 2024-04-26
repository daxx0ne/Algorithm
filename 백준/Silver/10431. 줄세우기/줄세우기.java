import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        for (int i = 1; i < p + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            int count = 0;
            int[] height = new int[20];
            for (int j = 0; j < 20; j++) {
                height[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < j; k++) {
                    if (height[k] > height[j]) count++;
                }
            }
            System.out.println(i + " " + count);
        }
    }
}