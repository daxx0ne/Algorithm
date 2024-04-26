import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());
        set = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String cal = st.nextToken();
            int num;

            switch (cal) {
                case "add" -> {
                    num = Integer.parseInt(st.nextToken());
                    if (!set.contains(num)) set.add(num);
                }
                case "remove" -> {
                    num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)) set.remove((Integer) num);
                }
                case "check" -> {
                    num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                }
                case "toggle" -> {
                    num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)) set.remove((Integer) num);
                    else set.add(num);
                }
                case "all" ->
                        set = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 18, 20));

                case "empty" -> set = new ArrayList<>();
            }
        }
        System.out.println(sb);
    }
}