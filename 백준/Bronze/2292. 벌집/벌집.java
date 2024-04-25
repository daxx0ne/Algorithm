import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int room = Integer.parseInt(br.readLine());
        int num = 1;
        int i = 1;
        while (true) {
            if (room <= num) break;
            else {
                num += 6 * i;
                i++;
            }
        }
        System.out.println(i);
    }
}