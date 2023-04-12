import java.io.*;

public class Main {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n + 1];
        dp[1] = 1; // 2x1일때
        if(n >= 2) dp[2] = 3; // 2x2일때
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007; // 점화식
        }
        System.out.println(dp[n]);
    }
}