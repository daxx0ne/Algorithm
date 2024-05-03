import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        if(n == 0) {
            System.out.println(1);

            System.exit(0);

        }
        Integer[] list = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list, Collections.reverseOrder());

        if (n == p && score <= list[list.length - 1]) System.out.print(-1);

        else {
            int rank = 1;
            for (Integer i : list) {
                if (score < i)
                    rank++;
                else
                    break;
            }
            System.out.print(rank);
        }
    }
}
