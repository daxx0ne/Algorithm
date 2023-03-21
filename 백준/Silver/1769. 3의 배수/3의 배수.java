import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int count = 0;
        while (true) {
            int sum = 0;
            if (n.length() == 1) {
                break;
            }
            for (int i = 0; i < n.length(); i++) {
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            count++;
            n = String.valueOf(sum);

        }
        if (Integer.parseInt(n) % 3 == 0) {
            System.out.println(count);
            System.out.println("YES");
        } else {
            System.out.println(count);
            System.out.println("NO");
        }
    }
}