import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNum = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int getOff = Integer.parseInt(st.nextToken());
            int getOn = Integer.parseInt(st.nextToken());
            count += getOn - getOff;
            if (maxNum < count) {
                maxNum = count;
            }
        }
        System.out.println(maxNum);
    }
}