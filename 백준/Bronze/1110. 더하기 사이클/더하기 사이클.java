import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int flag = n;
        do {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;
        } while (n != flag);
        System.out.println(count);
    }
}
